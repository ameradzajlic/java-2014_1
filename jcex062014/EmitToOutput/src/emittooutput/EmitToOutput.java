package emittooutput;

import java.io.Console;
import java.util.logging.ConsoleHandler;

public class EmitToOutput {
    public static void main(String[] args) {
        
        //Standard console output without new line 
        System.out.print("Hello from Java in one line\r");
        System.out.print("Hello from Java in one line, again\r");   
        
        //Standard console output with new line 
        System.out.println("Hello from Java with new line");
        System.out.println("Hello from Java with new line, again"); 
        
        //console output via Console object 
        Console c = System.console();
        c.writer().println("Hello from Java via console object"); 
        
        //Output to console, only if console exists 
        Console c1 = System.console();
        if(c1!=null){
            c1.writer().println("Console exist");
        }   
        
        //Getting data from console
        Console c2 = System.console();
        String line = c2.readLine();
        c2.writer().println("Hello " + line);
    }
}
