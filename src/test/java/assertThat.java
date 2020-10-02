import org.hamcrest.Matcher;
import org.junit.Test;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class assertThat {
    Calculator calculator = new Calculator();

    @Test
    public void siteElements1() {
        assertThat(calculator.title, is("Site Title"));
    }

    @Test
    public void siteElements2() {
        assertThat(calculator.title.length(), is(5));
    }

    @Test
    public void siteElements3() {
        String title = "Site Title";
        assertThat("not equal!", calculator.title, is("Site Title2"));
    }

    @Test
    public void siteElements4() {
        String title = "Site Title";
        assertThat("is Empty", calculator.title, is(""));
    }

    @Test
    public void siteElements5() {
        String title = "Site Title";
        assertThat("contains code elements", calculator.title, is("{month}"));
    }

    private Matcher<? super String> is(String site_title) {
        return null;
    }

    private Matcher<? super Integer> is(int i) {
        return null;
    }
}