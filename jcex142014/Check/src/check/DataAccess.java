package check;  
import java.math.BigDecimal;
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DataAccess {
    public Connection conn;
    public void connect() throws SQLException{
        this.conn = DriverManager.getConnection("jdbc:derby:checkdatabase;create=true");
        /*
        Statement ddl = this.conn.createStatement();
        String db_structure = "create table bills ("+
                              "id int primary key "+
                              "GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"+
                              "name varchar(128),"+
                              "price decimal(9,2),"+
                              "selltime timestamp default current_timestamp"+
                              ")"; 
        ddl.execute(db_structure);
        */
    }
    
     public void deleteBill(int id) throws SQLException{
         String sql = "delete from bills where id = ?";
         PreparedStatement st = this.conn.prepareStatement(sql);
         st.setInt(1,id);
         st.execute();
         listAllBills();
     }
    
    public void listAllBills() throws SQLException{
        String sql = "select * from bills";
        ResultSet res = this.conn.createStatement().executeQuery(sql);
        System.out.println("*************************************************************");
        System.out.println("id\tname\t\tprice\ttime");
        while(res.next()){
            System.out.printf("%s\t%s\t\t%s\t%s\n",res.getString(1),res.getString(2),res.getString(3),res.getString(4));
        }
    }
    public void insertBill(String product_name, double price) throws SQLException{
        String sql = "insert into bills (name,price) values (?,?)";
        PreparedStatement st =this.conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        st.setString(1,product_name);
        st.setDouble(2, price);
        st.execute();
        ResultSet keys = st.getGeneratedKeys();
        keys.next();
        int key = keys.getInt(1);
        System.out.println("New product added with key " + key);
    }
    public void disconnect() throws SQLException{
        this.conn.close();
    }
}
