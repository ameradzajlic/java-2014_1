package auction; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement; 
import java.util.HashMap;
import java.util.Map;
public class AuctionsDao {
        public Connection conn = null;
        Statement fill_st;
        Statement update_st;
        public void connect() throws SQLException{
            conn = DriverManager.getConnection("jdbc:mysql://localhost/travel","root","");
            fill_st = conn.createStatement();
            update_st = conn.createStatement();
        }
        public void disconnect() throws SQLException {
            conn.close();
        }
        public void addToBatch(int id, boolean status) throws SQLException{ 
            update_st.addBatch("update auctions set active = " + ((status)?"1":"0") + " where id = " + id);
        }
        public void confirmBatch() throws SQLException{
            int[] updates_arr = update_st.executeBatch();
            if(updates_arr.length>0){
                    System.out.println(updates_arr.length + " updates performed");
            }
        }
        public Map getAuctions() throws SQLException{ 
        Map auctions = new HashMap(); 
        ResultSet au_res = fill_st.executeQuery("select * from auctions");
        while(au_res.next()){
                auctions.put(au_res.getInt(1),new AuctionObject(
                        au_res.getInt(1),
                        au_res.getTimestamp(4),
                        au_res.getTimestamp(5),
                        au_res.getBoolean(6)
                ));
            }
            return auctions;
        }
}
