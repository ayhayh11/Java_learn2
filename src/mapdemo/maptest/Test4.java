package mapdemo.maptest;

import java.util.HashMap;
import java.util.Map;

public class Test4 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<String, String>();
        m.put("coke", "5");
        m.put("soda", "3");
        m.put("water", "2");
        m.forEach((key, val) -> System.out.println(key+ "=" + val));
    }
}
