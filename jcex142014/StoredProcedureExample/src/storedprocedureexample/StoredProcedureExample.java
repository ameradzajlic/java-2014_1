package storedprocedureexample;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StoredProcedureExample {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/travel", "root","");
        CallableStatement cs = conn.prepareCall("{call changeBalance(?,?,?)}");
        cs.setInt(1,1);
        cs.setInt(2,2);
        cs.setBigDecimal(3, new BigDecimal(75));
        cs.execute();
    }
}
