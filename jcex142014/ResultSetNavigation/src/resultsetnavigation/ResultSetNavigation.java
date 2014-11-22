package resultsetnavigation; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement; 
public class ResultSetNavigation {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/travel", "root", "");
        Statement st = conn.createStatement();
        ResultSet res = st.executeQuery("select * from accounts");
        //walk through results
        System.out.println("All rows");
        while(res.next()){
            System.out.println(res.getString(2));
        }
        System.out.println("Move to beginning and go through all rows again (beforeFirst)");
        res.beforeFirst();
        while(res.next()){
            System.out.println(res.getString(2));
        }
        System.out.println("Move two rows back");
        res.previous();
        res.previous();
        System.out.println(res.getString(2));
        System.out.println("Move to first row");
        res.first();
        System.out.println(res.getString(2));
        System.out.println("Move to last row");
        res.last();
        System.out.println(res.getString(2)); 
        res.absolute(2);
        System.out.println(res.getString(2)); 
        res.relative(1);
        System.out.println(res.getString(2)); 
    }
}
