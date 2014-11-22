package auction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map; 
public class Auction {
    public static void main(String[] args) throws SQLException, InterruptedException { 
        Connection conn;
        while(true){
            conn = DriverManager.getConnection("jdbc:mysql://localhost/travel","root","");
            Statement st = conn.createStatement();
            st.executeUpdate("UPDATE auctions SET active = CASE "
                    + "WHEN starttime<now() and endtime>now() THEN 1 "
                    + "WHEN endtime<now() and active = 1 THEN 0 "
                    + "else 0 END");
            Thread.sleep(1000);
            conn.close();
        }
        
        
        
        //AuctionManager manager = new AuctionManager();
        //manager.ticker();
    }   
}
