package bitmasks;
public class BitMasks {
    public static void main(String[] args) {
        int cannon = 1;
        int turret = 2;
        int body = 4;
        int collission_mask = turret | body;
        int bullet_state = 0;
        //bullet is not in tank area at all
        System.out.println(bullet_state&collission_mask);
        //Bullet is over cannon area, and therefore not suited for collission
        bullet_state|=cannon;
        System.out.println(bullet_state&collission_mask);
        //Bullet is over turret area, and therefore suited for collission
        bullet_state|=turret;
        System.out.println(bullet_state&collission_mask);
        //bullet is not over turret, but just over cannon 
        //and therefore not suited for collission
        bullet_state &= ~turret; 
        System.out.println(bullet_state&collission_mask); 
    } 
}
