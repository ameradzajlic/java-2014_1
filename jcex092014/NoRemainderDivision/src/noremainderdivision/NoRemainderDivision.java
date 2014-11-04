package noremainderdivision;
public class NoRemainderDivision {
    public static void main(String[] args) {
       int x = 523134;
        int y = 325423;
        int remainder = x % y;
        System.out.println(remainder);
        switch(remainder){
            case 0:
                System.out.println("Division without reminder");
            break;
            default:
                if(remainder>1000){
                    System.out.println("Remainder over 1000");    
                } else {
                    System.out.println("Reinder lower or equals ");
                }
            break;
        }
    } 
}
