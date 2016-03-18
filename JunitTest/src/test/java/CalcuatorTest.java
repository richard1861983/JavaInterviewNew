

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static junit.framework.TestCase.assertEquals;

/**
 * Calcuator Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>16, 2016</pre>
 */
public class CalcuatorTest {

    @Before
    public void before() throws Exception {
        System.out.println("Liang Before!!!");
    }

    @After
    public void after() throws Exception {
        System.out.println("Liang After!!!");
    }

    /**
     * Method: add(double n1, double n2)
     */
    @Test(timeout = 100)
    public void testAdd() throws Exception {

        Calcuator calcuator = new Calcuator();
        double result = calcuator.add(1, 2);
        Thread.sleep(3000);
        assertEquals(3, result, 0);
    }


} 
