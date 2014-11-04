package selectionifelse;
public class SelectionIfElse {
    public static void main(String[] args) { 
        //Check with only two possible states
        boolean hero_is_dead = true;
        if(hero_is_dead){
            System.out.println("Hero is dead. Reviving");
            hero_is_dead = false;
        } else {
            System.out.println("Hero is not dead. Nothing to do.");
        }
        
        System.out.println(
          hero_is_dead?"Hero is dead. Reviving":"Hero is not dead. Nothing to do."
        );
        
        //Check multiple states
        //1 = dead
        //2 = critical
        //3 = full health
        byte hero_state = 1;
        if(hero_state==1){
            System.out.println("I am dead. Well... I am dead");
            hero_state = 3;
            System.out.println("Alive again");
        } else 
        if(hero_state==2) {
            System.out.println("I am in critical condition. Not superhappy");
        } else
        if(hero_state==3){
            System.out.println("I am full, feel perfect");
        }
        
        //nesting if condition
        int x = 20;
        if(x<30)
            if(x>10)
                if(x<25)
                    if(x>15)
                        System.out.println("X is exclusively between 15 and 25");
    }   
}
