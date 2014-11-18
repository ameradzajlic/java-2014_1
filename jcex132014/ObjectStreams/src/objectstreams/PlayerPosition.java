package objectstreams; 
import java.io.Serializable; 
public class PlayerPosition implements Serializable{
    public int x;
    public int y;
    public PlayerPosition(int x, int y){
        this.x = x;
        this.y = y;
    } 
}
