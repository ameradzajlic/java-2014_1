package compareoperators1;
public class CompareOperators1 {
    public static void main(String[] args) {
        int target_tank_x = 4;
        int projectile_x = 0; 
        projectile_x++;
        System.out.println("Collission: " + (projectile_x>target_tank_x));
        projectile_x++;
        System.out.println("Collission: " + (projectile_x>target_tank_x));
        projectile_x++;
        System.out.println("Collission: " + (projectile_x>target_tank_x));
        projectile_x++;
        System.out.println("Collission: " + (projectile_x>target_tank_x));
        projectile_x++;
        System.out.println("Collission: " + (projectile_x>target_tank_x)); 
    }
    
}
