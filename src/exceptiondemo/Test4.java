package exceptiondemo;

public class Test4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
           /*String message = e.getMessage();
           System.out.println(message);*/
         /*   String s = e.toString();
            System.out.println(s);*/
            e.printStackTrace();//输出异常信息,不会停止程序运行
        }
        System.out.println("程序继续执行");
       // System.err.println("程序继续执行");
    }
}
