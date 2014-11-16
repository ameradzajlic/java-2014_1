package calculatortestexample;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses(
        {   
            calculatortestexample.CalculatorTest.class,
            calculatortestexample.AnimatorTest.class,
            calculatortestexample.SomeClass.class,
            calculatortestexample.TestWithAnnotations.class
        }
)
public class CalculatorTestSuite {   
}
