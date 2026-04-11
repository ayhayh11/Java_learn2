package mapdemo.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        //70%男生，30%女生
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 1, 1, 1, 1, 1, 1,0,0,0);
        Collections.shuffle( list);
        Random r= new Random();
        int index = r.nextInt(list.size());
        Integer i = list.get(index);
        System.out.println(i);
        ArrayList<String> boy = new ArrayList<>();
        ArrayList<String> girl = new ArrayList<>();
        Collections.addAll(boy, "张5", "张4", "张3", "张2", "张1");
        Collections.addAll(girl, "王5", "王4", "王3", "王2", "王1");
        if(i==1){
            int indexboy = r.nextInt(boy.size());
            System.out.println(boy.get(indexboy));
        }else{
            int girlindex=r.nextInt(girl.size());
            System.out.println(girl.get(girlindex));
        }
    }
}
