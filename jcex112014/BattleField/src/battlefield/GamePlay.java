package battlefield; 
import static battlefield.GameStates.Uninitialized;
import java.util.ArrayList;
import java.util.Random;
public class GamePlay {
    public GameStates gamestate;
    public int shoots; 
    Point user;
    Point computer;
    int matrix_size = 10;
    ArrayList trajectory;
    public GamePlay(int matrix_size){
        this.matrix_size = matrix_size;
        trajectory = new ArrayList();
        gamestate = Uninitialized;
        shoots = 0;
    } 
    public void addPlayer(PlayerType ptype){
        addPlayer(ptype,0,0);
    }
    public void addPlayer(PlayerType ptype,int x, int y){
        switch(ptype){
            case Man:
                user = new Point(x,y); 
            break;
            case Computer:
                Random r = new Random();
                computer = new Point(r.nextInt(matrix_size-2)+1,r.nextInt(matrix_size-2)+1);
                gamestate = GameStates.Running;
            break;
        }
    }
    public void reset(){
        this.shoots = 0;
        trajectory.clear();
        gamestate = GameStates.Uninitialized;
    }
    public boolean shoot(int angle,PlayerType trgt){
        Point source , target;
        if(trgt==PlayerType.Computer.Computer){
            shoots++;
            source = user;
            target = computer;
        } else {
            source = computer;
            target = user;
        }
        double radians = angle*Math.PI/180;
        int speed = 1;
        double x = source.x, y = source.y;
        trajectory.clear();
        trajectory.add(new Point((int)x,(int)y)); 
        int counter = 0;
        while(true){
            x+=speed*Math.cos(radians);
            y+=speed*Math.sin(radians); 
            if((int)x==target.x&&(int)y==target.y){ 
                this.gamestate = GameStates.Finished;
                return true;
            }
            if((int)x<=0||(int)x>matrix_size||(int)y<0||(int)y>matrix_size){
                return false;
            }
            trajectory.add(new Point((int)x,(int)y));
        }  
    }
    public void draw(){
        for(int h=0;h<matrix_size;h++){
            for(int w=0;w<matrix_size;w++){
                if(user!=null&&h==user.y&&w==user.x){
                    System.out.print("U");
                } else 
                if(computer!=null&&h==computer.y&&w==computer.x){
                    System.out.print("C");
                } else {
                    if(h==0||h==matrix_size-1||w==0||w==matrix_size-1){
                        System.out.print("O");
                    } else {
                        boolean point_draw = true;
                        for(Object pto : trajectory){
                            Point pt = (Point)pto;
                            if(pt.x==w&&pt.y==h){
                                System.out.print("*");
                                point_draw = false;
                            }
                        }
                        if(point_draw) {
                            System.out.print(" ");
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
