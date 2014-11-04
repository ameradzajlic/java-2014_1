package simpleanimation;
import java.io.IOException;
public class SimpleAnimation {
    public static void main(String[] args) throws InterruptedException, IOException {
        int x=0,right_bound=40,dir=1;  
        while(true){  
            for(int i=0;i<right_bound;i++){
                System.out.print((x==i)?"*":" "); 
            }
            x+=dir;
            if(x<0||x>=right_bound) {
                dir*=-1;
            }
            System.out.print("\r");
            Thread.sleep(50);
       }
    }
}
