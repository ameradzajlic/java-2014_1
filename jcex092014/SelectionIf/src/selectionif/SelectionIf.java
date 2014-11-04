package selectionif;
public class SelectionIf {
    public static void main(String[] args) {
        //One line selection and conditional code
        if(true) System.out.println("True, indeed");
        
        //Selection and conditional code in separate lines
        if(true) 
            System.out.println("True, indeed");
        
        //Selection and conditional code separated by large space
        if(true) 
            
            
            System.out.println("True, indeed");
        
        //Conditional code block        
        if(false) {
            System.out.println("This is false");
            System.out.println("Indeed");
        }
        
        //Test number equality
        int x = 10;
        if(x==10){
            System.out.println("x is 10");
        }
        
        //Two expressions connected with logical operator
        double health = 20;
        boolean dead = false;
        health-=25;
        if(health<20&&!dead){
            dead = true;
        }
        
        //Check strings for equality
        String entered_uname = "peter";
        String entered_pass = "123";
        String stored_uname = "peter";
        String stored_pass = "123";
        if(entered_uname==stored_uname&&entered_pass==stored_pass){
            System.out.println("user is valid");
        } 
        
        //Better use equals method for string check
        if(entered_uname.equals(stored_uname)&&entered_pass.equals(stored_pass)){
            System.out.println("user is valid");
        } 
        
        //Because, when you have two objects
        String stored_pass_ref = new String("123");
        String entered_pass_ref = new String("123");
        
        //Equals will check their equality
        if(stored_pass_ref.equals(entered_pass_ref)){
            System.out.println("They are the same");
        } 
        //But == will not, but rather only check if they 
        //are pointing to same memory address
        if(stored_pass_ref==entered_pass_ref){
            System.out.println("They are not same for me");
        }  
    }
}
