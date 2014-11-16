package calculatortestexample;
public class Animator {
    public AnimatePoint move(AnimatePoint current_pos){
        current_pos.y+=1;
        return current_pos;
    }
    public AnimatePoint jump(AnimatePoint current_pos){
        current_pos.y+=2;
        return current_pos;
    }
}
