package mapdemo.maptest;

import java.util.HashMap;
import java.util.Map;

public class test1 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<String, String>();
        m.put("可乐", "5");
        m.put("雪碧", "3");
        m.put("水", "2");
        System.out.println(m.put("可乐2", "5"));
        // String put = m.put("水", "1");
        //System.out.println(put);
        String remove = m.remove("可乐");
        System.out.println(remove);
        //m.clear();
        System.out.println(m.containsKey("可乐2"));
        System.out.println(m.containsValue("5"));
        System.out.println("是否为空" + m.isEmpty());
        System.out.println(m.size());
        System.out.println(m);
    }
}
