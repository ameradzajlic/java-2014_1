package calculatortestexample;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
public class AnimatorTest {
    
    public AnimatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of move method, of class Animator.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        AnimatePoint current_pos = new AnimatePoint(10,10);
        Animator instance = new Animator();
        AnimatePoint expResult = current_pos;
        AnimatePoint result = instance.move(current_pos);
        assertEquals(expResult, result); 
    } 
    @Test
    public void testJump() {
        System.out.println("jump");
        AnimatePoint current_pos = new AnimatePoint(10, 10);
        Animator instance = new Animator();
        AnimatePoint expResult = new AnimatePoint(10,12);
        AnimatePoint result = instance.jump(current_pos);
        assertEquals(expResult.y, result.y); 
    }
    
}
