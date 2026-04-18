package exceptiondemo;

public class Test3 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        try {
            System.out.println(2 / 0);
            System.out.println(arr[10]);
        } catch (NullPointerException n ) {
            System.out.println("空指针异常");
        }
    }
}
