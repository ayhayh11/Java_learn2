package mapdemo.maptest;
import java.util.*;
import java.util.function.Consumer;

public class Test3 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<String, String>();
        m.put("coke", "5");
        m.put("soda", "3");
        m.put("water", "2");
        //键值对方法遍历
        //获取所有对，放到单列集合中
        Set<Map.Entry<String, String>> set = m.entrySet();
        for (Map.Entry<String, String> entry : set) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        //迭代器
        Iterator<Map.Entry<String, String>> iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        //lambda表达式
        set.forEach(entry-> {
                String key = entry.getKey();
                String value =entry.getValue();
                System.out.println(key + "=" + value);
            }
        );
    }
}
