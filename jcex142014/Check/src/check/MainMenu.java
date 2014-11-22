package check;
import java.util.Scanner;
public class MainMenu {
    public static MenuOption RenderMenu(){
        System.out.println("1. New bill, 2. all bills 3. delete bill 4. exit program");
        Scanner scanner = new Scanner(System.in);
        while(true){
            try{
                int choice = scanner.nextInt();
                MenuOption res = MenuOption.values()[choice-1];
                return res;
            } catch(Exception ex){
                System.out.println("Invalid choice. Please try again"); 
                scanner.next();
            }
        }
    }
}
