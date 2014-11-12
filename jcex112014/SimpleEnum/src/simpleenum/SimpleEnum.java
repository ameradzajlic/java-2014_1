package simpleenum;

import java.util.EnumSet;

public class SimpleEnum {
    public static void main(String[] args) { 
        //With Game constants
        int GameStatus = Game.RUNNING;
        switch(GameStatus){
            case Game.STOPPED:
                System.out.println("Game is stopped");
            break;
            case Game.PAUSED:
                System.out.println("Game is paused");
            break;
            case Game.RUNNING:
                System.out.println("Game is running");
            break; 
        } 
        
        //With GameState enum
        GameState state = GameState.Paused;
        switch(state){
            case Stopped:
                System.out.println("Game is stopped");
            break;
            case Paused:
                System.out.println("Game is paused");
            break;
            case Running:
                System.out.println("Game is running");
            break; 
        } 
        
        String persisted_state = "Running";
        GameState recovered = GameState.valueOf(persisted_state);
        System.out.println("Game state is " + recovered);
        
        System.out.println("Available game states");
        for(GameState st : GameState.values()){
            System.out.println("State: " + st);
        }
        
        System.out.println("Range of game states"); 
        EnumSet states_range = EnumSet.range(GameState.Paused, GameState.Stopped);
        for(Object st : states_range){
            System.out.println("State: " + (GameState)st);
        }
        
        FullGameState fg_state = FullGameState.Running;
        System.out.println(fg_state.state_description);
                
    } 
}
