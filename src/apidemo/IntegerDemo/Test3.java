package apidemo.IntegerDemo;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        String str = sc.nextLine();
        Double d = Double.parseDouble(str);
        System.out.println(d);
    }
}
