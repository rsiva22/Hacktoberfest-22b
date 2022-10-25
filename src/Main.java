import codingbat.Map1;
import codingbat.Map2;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String[] strings = {"One", "Seven", "Four","Testing"};
        Map<String, String> stuff = new HashMap<>();

        stuff.put("a", "test");
        stuff.put("a", "test");
        stuff.put("b", "something");
        Map<String, String> result = Map1.mapAB3(stuff);
        System.out.println(result);
    }

}