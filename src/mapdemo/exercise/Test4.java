package mapdemo.exercise;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        //集合嵌套
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        ArrayList<String> city1 = new ArrayList<>();
        Collections.addAll(city1, "沈阳", "大连", "鞍山", "抚顺", "本溪", "丹东", "锦州");
        hm.put("辽宁", city1);
        ArrayList<String> city2 = new ArrayList<>();
        Collections.addAll(city2, "南京", "苏州", "无锡", "常州", "南通", "扬州", "镇江", "泰州");
        hm.put("江苏", city2);
        ArrayList<String> city3 = new ArrayList<>();
        Collections.addAll(city3, "哈尔滨", "齐齐哈尔", "牡丹江", "佳木斯", "绥化", "黑河", "大兴安岭");
        hm.put("黑龙江", city3);
        Set<Map.Entry<String, ArrayList<String>>> entries = hm.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

    }
}
