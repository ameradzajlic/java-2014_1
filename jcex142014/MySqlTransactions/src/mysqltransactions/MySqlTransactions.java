package mysqltransactions; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement; 
public class MySqlTransactions {
    public static void main(String[] args) throws SQLException, InterruptedException {
       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel", "root", ""); 
       conn.setAutoCommit(false);
       Statement st = conn.createStatement();
       st.execute("insert into accounts values (null,'John',500)");
       ResultSet res = st.executeQuery("select * from accounts");
       while(res.next()){
           System.out.println(res.getString(1)+" "+res.getString(2)+" "+res.getString(3));
       }
       Savepoint tran_checkpoint = conn.setSavepoint();
       st.execute("insert into accounts values (null,'John',500)");
       res = st.executeQuery("select * from accounts");
       while(res.next()){
           System.out.println(res.getString(1)+" "+res.getString(2)+" "+res.getString(3));
       }
       conn.rollback(tran_checkpoint);
       conn.commit(); 
    }
}
