package batchqueries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchQueries {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/travel","root","");
        Statement st = conn.createStatement();
        for(int i=0;i<1000;i++){
            st.addBatch("update accounts set balance = 200 where id = " + i);
        } 
        st.executeBatch();
    }
}
