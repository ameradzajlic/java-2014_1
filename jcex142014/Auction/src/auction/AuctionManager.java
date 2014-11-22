package auction; 
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map; 
public class AuctionManager {
    public Map auctions;
    public AuctionsDao auctions_dao;
    public AuctionManager() throws SQLException{
         auctions_dao = new AuctionsDao();
         auctions_dao.connect();
         auctions = auctions_dao.getAuctions();
         auctions_dao.disconnect();
    }
    public void checkTimes() throws SQLException{
            int updates = 0;
            Iterator entries = auctions.entrySet().iterator(); 
            auctions_dao.connect();
            while(entries.hasNext()){
                Map.Entry entry = (Map.Entry)entries.next();
                AuctionObject curr = (AuctionObject)entry.getValue();
                Calendar c = new GregorianCalendar();
                Timestamp now = Timestamp.from(Instant.now());
                if(curr.starttime.before(now)&&curr.endtime.after(now)&&!curr.status){ 
                    auctions_dao.addToBatch(curr.id, true);
                    updates++;
                    curr.status = true;
                } else 
                if(curr.endtime.before(now)&&curr.status){ 
                    auctions_dao.addToBatch(curr.id, false);
                    updates++;
                    curr.status = false;
                } 
            }
            if(updates>0){
                    auctions_dao.confirmBatch();
                }
            auctions_dao.disconnect(); 
    }
    public void ticker() throws SQLException, InterruptedException{ 
        short secs_from_last_refresh = 0;
        while(true){
            checkTimes();
            Thread.sleep(1000);
            if(secs_from_last_refresh++>9){
                secs_from_last_refresh = 0;
                auctions_dao.connect();
                auctions = auctions_dao.getAuctions();
                auctions_dao.disconnect();
            }
        }
    }
}
