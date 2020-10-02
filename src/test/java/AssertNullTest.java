import org.junit.Test;

import static org.junit.Assert.*;

public class AssertNullTest {
    Calculator calculator = new Calculator();

    @Test
    public void prodID1() {
        String prod5 = calculator.prodID("prod5");
        assertNull(prod5);
    }

    @Test
    public void prodID2() {
        String prod5 = calculator.prodID("");
        assertNull(prod5);
    }

    @Test
    public void prodID3() {
        char prod2 = calculator.prodID("prod2").charAt(7);
        assertNull(prod2);
    }

    @Test
    public void prodID4() {
        int prod3 = calculator.prodID("prod3").indexOf(9);
        assertNull(prod3);
    }

    @Test
    public void prodID5() {
        int prod1 = Integer.parseInt(calculator.prodID("prod1").concat(""));
        assertNull(prod1);
    }
}