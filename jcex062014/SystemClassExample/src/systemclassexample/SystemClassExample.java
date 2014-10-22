package systemclassexample; 
import java.util.Map; 
public class SystemClassExample {
    public static void main(String[] args) {
        System.out.println("System class can be used for different purposes");
        System.out.println("1. To send things to output");
        System.out.println("Hello!");
        System.out.println("2. To get input from console");
        System.out.println("System.in");
        System.out.println("3. To get current timestamp in milliseconds");
        System.out.println(
                    System.currentTimeMillis()
        );
        System.out.println("3. To get various system informations");
        for(String envName : ((Map<String,String>)System.getenv()).keySet()){
            System.out.println(envName + " : " + System.getenv(envName));
        }
        System.out.println("4. To get application properties"); 
        System.out.println("5. To initiate garbage collection"); 
        System.gc();
        System.out.println("6. To get current timestamp in nanoseconds");
        System.out.println(
                    System.nanoTime()
        );
    }
    
}
