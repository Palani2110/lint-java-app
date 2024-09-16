import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ArithmeticTest {

    @Test
    public void testAddNumbers() {
        assertEquals(8, Arithmetic.addNumbers(5, 3));
        assertEquals(-2, Arithmetic.addNumbers(2, -4));
        assertEquals(0, Arithmetic.addNumbers(0, 0));
    }

    @Test
    public void testSubtractNumbers() {
        assertEquals(2, Arithmetic.subtractNumbers(5, 3));
        assertEquals(6, Arithmetic.subtractNumbers(2, -4));
        assertEquals(0, Arithmetic.subtractNumbers(0, 0));
    }

    @Test
    public void testCompute() {
        int[] results = Arithmetic.compute(5, 3);
        assertEquals(8, results[0]);
        assertEquals(2, results[1]);
    }
}
