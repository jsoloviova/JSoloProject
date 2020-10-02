import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    //sum
    @Test
    public void sum1() {
        assertEquals(calculator.sum(3, 2), 5);
    }

    @Test
    public void sum2() {
        assertEquals(calculator.sum(365464, 0), 365464);
    }

    @Test
    public void sum3() {
        assertEquals(calculator.sum(-6, 9), 3);
    }

    //multiply
    @Test
    public void multiply1() {
        assertEquals(calculator.multiply(6, 5), 30);
    }

    @Test
    public void multiply2() {
        assertEquals(calculator.multiply(2, 0), 0);
    }

    @Test
    public void multiply3() {
        assertEquals(calculator.multiply(-6, 9), -54);
    }
}