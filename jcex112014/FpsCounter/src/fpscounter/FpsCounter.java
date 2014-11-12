package fpscounter;
public class FpsCounter {
    static int fps = 0;
    public static void tick(){
        System.out.print("Current fps: " + fps + "\r");
    }
    public static void main(String[] args) throws InterruptedException {
        float estimated_interval = 1000.0f/30.0f; 
        long last_time = System.currentTimeMillis(),current_time = last_time, last_second = last_time;
        int curr_frame = 0;
        while(true){
            current_time = System.currentTimeMillis();
            if((current_time-last_time)>=estimated_interval){
                curr_frame++;
                tick(); 
                last_time = current_time;
            }
            if((current_time-last_second)>=1000){ 
                fps = curr_frame;
                curr_frame = 0; 
                last_second = current_time;
            }
        }
    } 
}
