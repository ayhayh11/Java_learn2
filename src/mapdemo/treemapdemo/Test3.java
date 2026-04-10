package mapdemo.treemapdemo;

import java.util.TreeMap;
import java.util.function.BiConsumer;

public class Test3 {
    public static void main(String[] args) {
        //求字符串中字符出现的次数“aababcbacdabcde”
        String s = "aababcbacdabcde";
        TreeMap<Character, Integer> tm = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (tm.containsKey(c)) {
                int count = tm.get(c);
                tm.put(c, count+1);
            }
            else {
                tm.put(c, 1);
            }
        }
        StringBuilder sb=new StringBuilder();
        tm.forEach(( key,  val)-> {sb.append( key).append("(").append(val).append(")");});
        System.out.println(sb);
    }
}
