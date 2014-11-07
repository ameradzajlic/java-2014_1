package rockpaperscissors; 
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner; 
public class RockPaperScissors {
    static String[] artefacts = { "Rock","Scissors","Paper" };
    static ArrayList stats;
    static void showStats(){
        System.out.println("******************************************************");
        System.out.printf("%1$-15s%2$-20s%3$-15s\n", "your choice","computer choice","result"); 
        for(Object st : stats){
            String[] stat = (String[])st;
            System.out.printf("%1$-15s%2$-20s%3$-15s\n", stat[0],stat[1],stat[2]); 
        }
    }
    public static void main(String[] args) {
        stats = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        String message = "";
        while(true){
            System.out.print("Choose number (0=Rock, 1=Scissors, 2=Paper, 3=Match Statistics): ");
            int your_choice = scanner.nextInt();
            if(your_choice==3){
                showStats();
                continue;
            }
            int computer_choice = rand.nextInt(3);
            System.out.println("Your choice: " + artefacts[your_choice] + ", Computer choice " + artefacts[computer_choice]);
            if(your_choice+1==computer_choice||(your_choice==2&&computer_choice==0)){
                message = "You won!";
            } else
            if(your_choice-1==computer_choice||(your_choice==0&&computer_choice==2)){
                message = "Computer win!";
            } else {
                message = "Draw game!";
            }
            System.out.println("You won!");
            stats.add(new String[]{artefacts[your_choice],artefacts[computer_choice],message});
        }
    }
}
