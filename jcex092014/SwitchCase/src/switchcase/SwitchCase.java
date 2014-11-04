package switchcase;
public class SwitchCase {
    public static void main(String[] args) {
        byte hero_state = 1;
        
        //if else structure
        if(hero_state==1){ System.out.println("Hero is dead"); }
        else if(hero_state==2){ System.out.println("Hero is low on health"); }
        else if(hero_state==3){ System.out.println("Hero is fully charged"); }
        
        //switch case structure
        switch(hero_state){
            case 1: {
                System.out.println("Hero is dead");
                System.out.println("Really dead");
                System.out.println("Dead like...you know");
                break;
            }
            case 2:
                System.out.println("Hero is low on health");
            break;
            case 3:
                System.out.println("Hero is fully charged");
            break;
        }
    }
}
