package exceptiondemo;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        try{
            System.out.println(arr[9]);
        }catch (ArrayIndexOutOfBoundsException e){
            //扩容数组
            int[] newArr = new int[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
                arr = newArr;
            }
            System.out.println(arr[9]);

        }
    }
}
