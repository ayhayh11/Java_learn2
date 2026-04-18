package exceptiondemo;

public class Test1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        try {
            System.out.println(arr[0]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界异常");
        }
        System.out.println("happyhappyhappy");
    }
}
