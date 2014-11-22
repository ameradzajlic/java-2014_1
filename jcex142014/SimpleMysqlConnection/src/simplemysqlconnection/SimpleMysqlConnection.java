package simplemysqlconnection;

 
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import static java.sql.Statement.RETURN_GENERATED_KEYS;
import java.util.Arrays;
import java.util.Properties;

public class SimpleMysqlConnection {
    public static void main(String[] args) throws SQLException { 
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","");
        if(!conn.isClosed()){
            System.out.println("Connection is established");
        } else {
            System.out.println("Connection is not established");
        }  
        Statement st_persons = conn.createStatement();
        ResultSet res = st_persons.executeQuery("select * from person");
        String[] columns = new String[res.getMetaData().getColumnCount()];
        for(int i=0;i<columns.length;i++) {
            System.out.print((columns[i] = res.getMetaData().getColumnName(i+1))+"\t");  
        }
        System.out.println();
        while(res.next()){
            for(int i=0;i<columns.length;i++) {
                System.out.print(res.getString(columns[i])+"\t");
            }
            System.out.println();
        }
        
        System.out.println("CONNECTION METADATA");
        System.out.println("All databases list:");
        DatabaseMetaData db_metadata = conn.getMetaData();
        ResultSet databases = db_metadata.getCatalogs();
        while(databases.next()) 
            System.out.println("Database: " + databases.getString(1));
        System.out.println("TABLE METADATA");
        ResultSetMetaData rs_metadata = res.getMetaData();
        System.out.println("Database: " + rs_metadata.getCatalogName(1));
        System.out.println("Table: " + rs_metadata.getTableName(1));
         
        st_persons.execute("insert into users (firstname,lastname) values ('peter','jackson')",RETURN_GENERATED_KEYS);
        long last_id = -1;
        ResultSet generated_keys = st_persons.getGeneratedKeys();
        if(generated_keys.next()){
            last_id = generated_keys.getLong(1);
        }
        System.out.println("Last generated key: " + last_id);
        
    }
}
