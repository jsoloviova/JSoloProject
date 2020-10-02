import org.junit.Test;

import static org.junit.Assert.*;

public class AssertSameTest {
    Calculator calculator = new Calculator();

    @Test
    public void linkAttributes1() {
        boolean attrList = calculator.linkAttributes("prodID", "prodName", "partnerName");
        assertSame(true, attrList);
    }

    @Test
    public void linkAttributes2() {
        boolean attrList = calculator.linkAttributes("", "prodName", "partnerName");
        assertNotSame(false, attrList);
    }

    @Test
    public void linkAttributes3() {
        boolean attrList = calculator.linkAttributes("prodID", "", "partnerName");
        assertNotSame(false, attrList);
    }

    @Test
    public void linkAttributes4() {
        boolean attrList = calculator.linkAttributes("prodID", "prodName", "");
        assertNotSame(false, attrList);
    }

    @Test
    public void linkAttributes5() {
        boolean attrList = calculator.linkAttributes("", "", "");
        assertNotSame(false, attrList);
    }

}