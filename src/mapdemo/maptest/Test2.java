package mapdemo.maptest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class Test2 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<String, String>();
        m.put("coke", "5");
        m.put("soda", "3");
        m.put("water", "2");
        //获取所有的键，放到单列集合当中
        Set<String> keys = m.keySet();
        for (String key : keys) {
            String value = m.get(key);
            System.out.println(key + "=" + value);
        }
        //迭代器
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String key = it.next();
            String value = m.get(key);
            System.out.println(key + "=" + value);
        }
        //lambada
        keys.forEach(s -> System.out.println(s + "=" + m.get(s)));

    }
}
