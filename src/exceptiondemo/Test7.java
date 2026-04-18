package exceptiondemo;

import java.util.ArrayList;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        //键盘录入姓名和年龄，长度3-10位，年龄的范围是18-40，超出这个范围的，请重新输入，直到输入正确为止
        girlfriend gf = new girlfriend();
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("请输入姓名：");
                String name = sc.nextLine();
                gf.setName( name);
                System.out.println("请输入年龄：");
                String agestr = sc.nextLine();
                int age = Integer.parseInt(agestr);
                gf.setAge(age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("年龄格式是错误的");
            }catch (RuntimeException e){
                System.out.println("姓名的长度或者年龄大小有问题");
            }
        }
        System.out.println(gf);
    }


}

