import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    Fibonacci fibonacci = new Fibonacci();

    @Test
    public void fibonacciTest() {

        assertEquals(55, fibonacci.Fibonacci(10));


    }
}