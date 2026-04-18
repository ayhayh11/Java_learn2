package exceptiondemo;

public class Test2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        try{
            System.out.println(2/0);
            System.out.println(arr[10]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界异常");
        }
        catch (ArithmeticException a){
            System.out.println("算术异常");
        }
        System.out.println("happyhappyhappy");
    }
}
