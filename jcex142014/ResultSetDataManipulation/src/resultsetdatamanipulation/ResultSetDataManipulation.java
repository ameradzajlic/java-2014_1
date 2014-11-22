package resultsetdatamanipulation;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetDataManipulation {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/travel","root","");
        Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet res = st.executeQuery("select * from accounts");
        
        //Position somewhere
        res.absolute(3);
        //Move to insert row position
        res.moveToInsertRow();
        res.updateString(2, "Brand new user");
        res.updateBigDecimal(3, new BigDecimal(500)); 
        res.insertRow();
        res.last();
        System.out.println("Row inserted with id " + res.getInt(1));
        //Go back to current row
        res.moveToCurrentRow();
        System.out.println(res.getString(2));
        
        //Delete row
        res.absolute(4);
        System.out.println("Row with id " + res.getInt(1) + " is about to be deleted");
        res.deleteRow(); 
        
        res.absolute(3);
        System.out.println("Users " + res.getInt(1) + " name is about to be changed");
        res.updateString(2, "Some other user");
        res.updateRow(); 
        res.absolute(1); 
        System.out.println("Transfer funds to user " + res.getInt(1));
        res.updateBigDecimal(3, res.getBigDecimal(3).add(new BigDecimal(50)));
        res.updateRow(); 
        res.absolute(2);
        System.out.println("Transfer funds from user " + res.getInt(1));
        res.updateBigDecimal(3, res.getBigDecimal(3).subtract(new BigDecimal(50)));
        res.updateRow();  
        conn.close();
    }
}
