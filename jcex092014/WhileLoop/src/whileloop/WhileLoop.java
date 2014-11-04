package whileloop;
public class WhileLoop {
    public static void main(String[] args) {
        //Simple controlled while loop
        int number = 5;
        while (number >= 2) {
                    System.out.println(number);
                    number--;
        }
        
        //while loop which never starts
        number = 5;
        while(number>5){
            System.out.println("Number is bigger than 5");
        }
        
        //do while loop
        do {
            System.out.println("Number is bigger than 5");
        } while(number>5);
        
        //loop is stopped after some 
        //inner condition has been met
        number = 0;
        while(number<5){
               if(number==3){
                   break;
               }
               System.out.println("Number: " + number);
               number++;
        }
        
        //outer loop is stopped after some 
        //inner condition has been met
        number = 0;
        outerloop:
        while(true){
            while(number<5){
               if(number==3){
                   break outerloop;
               }
               System.out.println("Number: " + number);
               number++;
            }
        }
        System.out.println("Program continue");
//        
        //using continue keyword to skip iteration
        System.out.println("Continue example:");
        number = 0; 
        while(number<5){
            if(number==3){ 
                    number++;
                    continue; 
            }
            System.out.println("Number: " + number);
            number++;
        } 
    }
}
