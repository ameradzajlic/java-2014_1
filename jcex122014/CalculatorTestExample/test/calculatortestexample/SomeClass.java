package calculatortestexample; 
import javafx.scene.control.SplitPane;
import org.junit.Test; 
public class SomeClass { 
    @Test(timeout = 999)
    public void timeoutExample1() throws InterruptedException { 
        System.out.println("I will not pass. Timeout smaller then pause");
        Thread.sleep(1000);
    }
    @Test(timeout = 1001)
    public void timeoutExample() throws InterruptedException { 
        System.out.println("I will pass. Timeout is ok");
        Thread.sleep(1000);
    }
    @Test(expected = ArithmeticException.class)
    public void expectedExample() throws InterruptedException { 
        System.out.println("It's ok. I expect division by zero.");
        int x = 10/0;
    }
    @Test
    public void zeroDivision() throws InterruptedException { 
        System.out.println("I don't expect division by zero. I will not pass.");
        int x = 10/0;
    }
}
