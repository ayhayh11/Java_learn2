package apidemo.testdemo;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //键盘录入1-100的整数，添加到集合当中，
        // 直到集合中所有数据的和超过两百就停止
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true){
            String str=sc.nextLine();
            int num=Integer.parseInt(str);

            if(num<1||num>100){
                System.out.println("输入的数字有误");
                continue;
            }
            list.add(num);
            int sum=getsum(list);
            if(sum>200){
                break;
            }
        }
        System.out.println(list);
    }
    public static int getsum(ArrayList<Integer> list){
        int sum=0;

        for (int i = 0; i < list.size(); i++) {
            sum+=list.get(i);
        }
        return sum;
    }
}
