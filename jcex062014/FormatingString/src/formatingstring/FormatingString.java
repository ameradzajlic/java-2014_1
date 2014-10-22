package formatingstring;
public class FormatingString {
    public static void main(String[] args) {
        double x = (113.0/112.0);
        System.out.println("Hello from number " + x);
        System.out.format("Hello from number %.2f%n",x); 
    } 
}
