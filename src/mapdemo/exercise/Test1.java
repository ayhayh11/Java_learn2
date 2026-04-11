package mapdemo.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        //随机点名器
        // 70%男生 30%女生
        //被点到的人不会再被点到，如果所有的人都被点到，则重新开始第二轮
        //1.创建集合，存储所有学生
        ArrayList<String> list = new ArrayList<>();
        //添加数据
        Collections.addAll(list, "张三", "李四", "王五", "赵六", "孙七", "周八", "吴九", "小十", "小十一", "小十二");
        //创建随机数
        Random random = new Random();
       int index= random.nextInt(list.size());
        System.out.println(list.get(index));
        Collections.shuffle(list);
        System.out.println(list.get(0));


    }
}
