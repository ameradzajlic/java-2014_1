package simpleanimation1;
public class SimpleAnimation1 {
    public static void main(String[] args) throws InterruptedException {
        int x=0,x1=30,right_bound=40,dir=1,dir1=-1;  
        while(true){  
            for(int i=0;i<right_bound;i++){
                System.out.print(
                        (x==i)?"*":(x1==i)?"#":" "
                ); 
            }
            x+=dir;
            x1+=dir1;
            if(x<0||x>=right_bound) { dir*=-1; }
            if(x1<0||x1>=right_bound) { dir1*=-1; }
            System.out.print("\r");
            Thread.sleep(50);
       }
    } 
}
