package simplematchmaking;
import java.util.Scanner;
public class SimpleMatchmaking {
    public static void main(String[] args) {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        int player_ids = 0;
        while(true) {
            System.out.print("Enter new player name: ");
            String playername = scanner.nextLine();
            game.addPlayer(new Player(++player_ids,playername));
        }
    }
}
