package simpleenum;
public enum FullGameState {
    Running(1,"Game is running"),Paused(2,"Game is paused"),Stopped(3,"Game is stopped");
    public int state_id;
    public String state_description;
    FullGameState(int id, String desc){
        state_id  = id;
        state_description = desc;
    }
}
