package check;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
public class Check {
    public static void main(String[] args) throws SQLException { 
        while(true){
            MenuOption selected_option = MainMenu.RenderMenu();
            DataAccess da = new DataAccess();
            da.connect();
            switch(selected_option){
                case New:
                    Scanner scanner = new Scanner(System.in);
                    while(true){
                        try {
                            System.out.print("Enter pruduct name: ");
                            String product_name = scanner.nextLine();
                            System.out.print("Enter pruduct price: ");
                            double product_price = scanner.nextDouble();
                            da.insertBill(product_name, product_price);
                            break;
                        } catch(Exception ex){
                            System.out.println("invalid entry, try again");
                            scanner.next();
                        }
                    }
                break;
                case List:
                    da.listAllBills();
                break;
                case Delete:
                    Scanner scanner1 = new Scanner(System.in);
                    while(true){
                        try {
                            System.out.print("Enter pruduct id: ");
                            int product_id = scanner1.nextInt();
                            da.deleteBill(product_id);
                            break;
                        } catch(Exception ex){
                            System.out.println("invalid entry, try again");
                            scanner1.next();
                        }
                    }
                break;
                case Exit:
                    System.exit(0);
                break;
            }
            da.disconnect(); 
        } 
        
    }
}
