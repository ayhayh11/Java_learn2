package apidemo.testdemo;

public class Test2 {
    public static void main(String[] args) {
        //自己实现parseint方法（要求将字符串数据转换为整数）
        //最少一位，最多10位
        //0不能开头
        String str="123321";
        if (!str.matches("[1-9]+\\d{0,9}")) {
            System.out.println("输入数据格式有误");
        }
        else{
            System.out.println("格式正确");
            int number = 0;
            for (int i = 0; i < str.length(); i++) {
                int c = str.charAt(i)-'0';
                number = number*10+c;
            }
            System.out.println( number);
            System.out.println(number+1);
        }

    }
}
