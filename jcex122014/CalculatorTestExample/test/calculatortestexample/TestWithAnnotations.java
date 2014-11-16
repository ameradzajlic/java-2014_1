package calculatortestexample;  
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test; 
public class TestWithAnnotations {
    @BeforeClass
    public static void beforeClassExample(){
        System.out.println("This will be started before all tests in this class");
    }
    @AfterClass
    public static void afterClassExample(){
        System.out.println("This will be started after all tests in this class");
    }
    @Before
    public void beforeExample(){
        System.out.println("This will be started before every test");
    }
    @After
    public void afterExample(){
        System.out.println("This will be started after every test");
    }
    @Test
    public void someTest(){
        System.out.println("Doing some tests");
    }  
    @Test
    public void someTest1(){
        System.out.println("Doing some more tests");
    }  
    @Ignore
    @Test
    public void someTest2() throws Exception{
        System.out.println("I will not be tested.... for now. Even I am marked with @Test annotation");
        throw new Exception(); //will never be thrown
    }  
}
