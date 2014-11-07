package simplematchmaking;
import java.util.ArrayList;
import java.util.List; 
public class Match {
    public List players;
    public int id;
    public Match(int id){
        this.id = id;
        this.players = new ArrayList();
    }
    public void Start() {
        System.out.println("Match " + this.id + " is started");
    }
}