import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Calculator {
    public Object siteElements;

    //CalculatorTest
    public int sum(int i, int j){
        return i + j;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    //AssertTrueTest
    public boolean isEven(int x, int y){
        return (x + y) % 2 == 0;
    }

    public boolean arrIsShort(Integer[] arr){
        return arr.length < 11;
    }

    //AssertSameTest
    public boolean linkAttributes(String prodID, String prodName, String partnerName){
        prodID ="prodID";
        prodName = "prodName";
        partnerName = "partnerName";
        return true;
    }

    //AssertThatTest
    public String title = "Site Title";

    //AssertNullTest
    public String prodID(String prodName) {
        Map<String, Integer> product = new HashMap<String, Integer>();
        product.put("prod1", 1);
        product.put("prod2", 2);
        product.put("prod3", 3);
        product.put("prod4", 4);
        return String.valueOf(product.get(prodName));
    }
}
