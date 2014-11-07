package moresimplematchmaking; 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 
public class MoreSimpleMatchmaking {
    public static void main(String[] args) {
        int players_limit = 3;
        List games = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        int players_in_game = 0;
        int games_count = 0;
        while(true){
            String player_name = scanner.nextLine();
            if(players_in_game==0){
                games.add(new ArrayList());
            } 
            ((ArrayList)games.get(games_count)).add(player_name);
            if(++players_in_game==players_limit){
                players_in_game = 0;
                games_count++;
            }
        }
    }
}
