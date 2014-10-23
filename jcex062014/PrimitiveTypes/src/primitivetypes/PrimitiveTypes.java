package primitivetypes;
public class PrimitiveTypes {
    public static void main(String[] args) {
        /* Model */
        byte crew_exp = 98;
        short engine_power = 700;
        float rate_of_fire = 8.96f;
        boolean showmark;
        showmark = true;
        char[] tank_name = {'V','K',' ','3','6','.','0','1',' ','(','H',')'};
        /* Presentation */
        System.out.print("Tank name: ");
        System.out.println(tank_name); 
        System.out.println("Engine power: " + engine_power);
        System.out.println("Rate of fire: " + rate_of_fire);
        System.out.println("Mark shown: " + showmark);
        System.out.println("Crew experience: " + crew_exp); 
    }
    
}
