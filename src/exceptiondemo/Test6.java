package exceptiondemo;

public class Test6 {
    public static void main(String[] args) {
     int[] arr={};
        int getmax = 0;
        try {
            getmax = getmax(arr);
        } catch (NullPointerException e) {
            System.out.println("数组为空");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界");
        }
        System.out.println(getmax);
    }
    public static int getmax(int[] arr){
        if(arr==null){
            //手动创建一个异常，交给调用者处理，此时方法结束，下面代码不会继续执行
            throw new NullPointerException("数组为空");
        }
        if (arr.length == 0) {
            throw new ArrayIndexOutOfBoundsException("数组长度为0");
        }
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
