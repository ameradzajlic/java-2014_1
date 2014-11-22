package auction; 
import java.sql.Timestamp; 
public class AuctionObject {
    public int id;
    public Timestamp starttime;
    public Timestamp endtime;
    public boolean status;
    public AuctionObject(int id, Timestamp starttime, Timestamp endtime, boolean status){
        this.id = id;
        this.starttime = starttime;
        this.endtime = endtime;
        this.status = status;
    }
}
