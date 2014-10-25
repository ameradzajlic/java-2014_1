package logicaloperatorssideeffects;
public class LogicalOperatorsSideEffects {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        boolean res = (x==10||++y==20); //y se nikada nece povecati
        System.out.println(res);
        System.out.println(y);
        
        res = (x==11&&++y==20); //y se nikada nece povecati
        System.out.println(res);
        System.out.println(y);
        
        y++; //povecavamo vrednost y izvan izraza, kako bi izbegli bocne efekte
        res = (
        (x>9&&x!=25&&y>19&&x!=10)||
         y!=20&&y==10||(x==1&&x==2&&x==3)
         ||true
        );
        System.out.println(res);
        
        //tank hit test
        int projectile_x = 10, projectile_y = 15;
        int tank_x = 12, tank_y = 12, tank_width = 10, tank_height = 5;
        boolean hit = (
                projectile_x > tank_x && projectile_x < (tank_x + tank_width) &&
                projectile_y > tank_y && projectile_y < (tank_y) + tank_height
        );
        System.out.println("Tank is hit: " + hit);
        
        
    }
    
}
