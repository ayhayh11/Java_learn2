package sortdemo.recursiondemo;

public class test1 {
    public static void main(String[] args) {
        //递归算法求1-100的和
        System.out.println(getsum(100));

    }
    public  static int getsum(int num){
        if(num==1){
            return 1;
        }
        return num+getsum(num-1);
    }
}
