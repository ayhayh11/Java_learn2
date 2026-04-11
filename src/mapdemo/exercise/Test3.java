package mapdemo.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        //被点到的人不会在被点到,如果都点完了开始第二轮点名
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "张三", "李四", "王五", "赵六", "孙七", "周八", "吴九", "郑十");
        Random r = new Random();
        int size = list1.size();
        int round=1;
        for (int j = 1; j <= 5; j++) {
            System.out.println("第"+round+"轮开始");
            round++;
            for (int i = 0; i < size; i++) {
                if(list1.isEmpty()){
                    Collections.addAll(list1, "张三", "李四", "王五", "赵六", "孙七", "周八", "吴九", "郑十");
                }
                int index= r.nextInt(list1.size());
                System.out.println(list1.get(index));
                list1.remove(index);
                System.out.println(list1);
            }
        }


    }
}
