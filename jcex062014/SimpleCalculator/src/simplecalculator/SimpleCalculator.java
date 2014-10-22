package simplecalculator;
import java.io.Console;
import java.io.IOException;
public class SimpleCalculator {
    public static void main(String[] args) throws IOException {
        Console console = System.console();
        System.out.println("Enter first operand:");
        //Get input with Console class
        String op1 = console.readLine();
        System.out.println("Enter second operand");
        //Get input with System.in
        String op2 = console.readLine();
        System.out.print("Result is ");
        System.out.println(
                (Integer.parseInt(op1)+Integer.parseInt(op2))
        );  
    }
}
