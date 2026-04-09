package mapdemo.hashmapdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        //80个学生，有四个景点abcd，每个学生只能投一个景点，请统计出那个景点投票最多
        String[] arr={"a","b","c","d"};
        ArrayList<String> list=new ArrayList<String>();
        Random random=new Random();
        for (int i = 0; i < 80; i++) {
            int index=random.nextInt(arr.length);
           list.add(arr[index]);
        }
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        for (String s : list) {
            if(map.containsKey(s)){
                Integer value = map.get(s);
                map.put(s,value+1);
            }else{
                map.put(s,1);
            }
        }
        System.out.println(map);
        String maxKey="";
        int maxcount=0;
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            if(value>maxcount){
                maxcount=value;
                maxKey=key;
            }
        }
        System.out.println(maxKey+"被投票了"+maxcount+"次");
    }
}
