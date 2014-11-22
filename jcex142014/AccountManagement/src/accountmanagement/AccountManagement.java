package accountmanagement; 
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException; 
import java.sql.Statement;
import java.util.Scanner;
import javax.sql.DataSource;
public class AccountManagement {
    public static void main(String[] args) throws SQLException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Enter first user id: ");
            int userid1 = scanner.nextInt();
            System.out.print("Enter second user id: ");
            int userid2 = scanner.nextInt();
            System.out.print("Enter amount: ");
            BigDecimal amount = scanner.nextBigDecimal(); 
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/travel","root","");
            conn.setAutoCommit(false);
            String sql = "update accounts set balance = balance + ? where id = ?";
            //First statement preparation
            PreparedStatement st = conn.prepareStatement(sql);
            st.setBigDecimal(1, amount.negate());
            st.setInt(2, userid1);
            st.execute();
            //Second statement preparation
            st.setBigDecimal(1, amount);
            st.setInt(2, userid2);
            st.execute();
            //Try adding this code, and then try to modify rows
            /*
            Thread.sleep(20000);
            */
            conn.commit();
        }
    }
}
