package apidemo.mathdemo;

public class MathDemo1 {
    public static void main(String[] args) {
       /* public static    int abs(int a)             获取参数绝对值
        public static      double ceil(double a)      向上取整
        public static      double floor(double a )    向下取整
        public static      int round(float a)         四舍五入
        public static      int max(int a,int b)       获取两个int值中的较大值
        public static      double pow(double a,double b)        返回a的b次幂的值
        public static      double random()             返回值为double的随机值，范围[e.e,1.0)*/
        //abs 获取参数绝对值
        System.out.println(Math.abs(-88));
        System.out.println(Math.ceil(5.5));
        System.out.println(Math.ceil(-5.1));
        System.out.println(Math.floor(5.5));
        System.out.println(Math.round(5.3219f));
        System.out.println(Math.max(29,11));
        System.out.println(Math.min(29,11));
        System.out.println(Math.pow(2,3));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.cbrt(8));
        System.out.println(Math.random());

    }
}
