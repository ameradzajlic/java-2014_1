package simpledbconnection;  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException; 
import java.sql.Statement;
import org.apache.derby.iapi.reference.ClassName;
public class SimpleDbConnection {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {  
        Connection conn = DriverManager.getConnection("jdbc:derby:mydatabase;create=true");
        if(conn.isClosed()){
            System.out.println("Connection to database failed");
            System.exit(0);
        } else {
            System.out.println("Connection to database successfull");
        }
        //Comment after DDL operatins are finished with success
        /*
        Statement st = conn.createStatement();
        String db_structure = "create table hiscores ("+
                              "id int primary key "+
                              "GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"+
                              "name varchar(128),"+
                              "score int"+
                              ")"; 
        st.execute(db_structure);
        */ 
        
        Statement st = conn.createStatement();
        /*
        try {
            st.execute("insert into hiscores (name,score) values ('player 2',25)");
            System.out.println("Score successfully inserted");
        } catch(SQLException ex) { System.out.println("Insert failed"); }
        */
        
        //Get single row
        ResultSet all_hiscores = st.executeQuery("select * from hiscores");
        if(all_hiscores.next()){
            System.out.println("player name\tscore");
            System.out.println(
                    all_hiscores.getString("name")+"\t"+
                    all_hiscores.getString("score")
            );
        }  
        //Get multiple rows
        all_hiscores = st.executeQuery("select * from hiscores");
        System.out.println("*********************");
        System.out.println("id\tplayer name\tscore");
        while(all_hiscores.next()){
            System.out.println(
                    all_hiscores.getString(1)+"\t"+
                    all_hiscores.getString("name")+"\t"+
                    all_hiscores.getInt(3)
            );
        }
        
        //Update rows
        PreparedStatement st_prep = 
                conn.prepareStatement("update hiscores set score = 55 where id = ?");
        st_prep.setInt(1, 2);
        int updated_rows_count = st_prep.executeUpdate();
        if(updated_rows_count>0){
            System.out.println(updated_rows_count + " row(s) successfully updated");
        } else {
            System.out.println("No updates performed");
        }
        
        
    }
}
