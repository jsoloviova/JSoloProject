import org.junit.Test;

import static org.junit.Assert.*;

public class AssertTrueTest {
    Calculator calculator = new Calculator();

    //isEven
    @Test
    public void isEven1() {
        assertTrue(calculator.isEven(14, 66));
    }

    @Test
    public void isEven2() {
        assertTrue(calculator.isEven(15, 67));
    }

    @Test
    public void isEven3() {
        assertTrue(calculator.isEven(-14, -66));
    }

    @Test
    public void isEven4() {
        assertTrue(calculator.isEven(-5, 5));
    }

    @Test
    public void isEven5() {
        assertFalse(calculator.isEven(21, 66));
    }

    //arrIsShort
    @Test
    public void arrIsShort1() {
        Integer[] arr = {};
        assertTrue(calculator.arrIsShort(arr));
    }

    @Test
    public void arrIsShort2() {
        Integer[] arr = {1, 2, 3, 4, 5};
        assertTrue(calculator.arrIsShort(arr));
    }

    @Test
    public void arrIsShort3() {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 11, 12};
        assertFalse(calculator.arrIsShort(arr));
    }

}