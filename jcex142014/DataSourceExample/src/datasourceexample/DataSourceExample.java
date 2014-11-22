package datasourceexample;
 
import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.ConnectionPoolDataSource;
import javax.sql.DataSource;

public class DataSourceExample {
    public static void main(String[] args) throws SQLException {
        MysqlDataSource ds = new MysqlDataSource(); 
        ds.setURL("jdbc:mysql://localhost");
        ds.setDatabaseName("travel");
        ds.setUser("root");
        ds.setPassword(""); 
        Connection conn = ds.getConnection();
        
        System.out.println(!conn.isClosed()?"Successfully connected to database":"Failed to connect");
        
        conn.close();
    }
}
