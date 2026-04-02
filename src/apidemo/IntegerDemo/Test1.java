package apidemo.IntegerDemo;

public class Test1 {
    public static void main(String[] args) {
        Integer i1 = new Integer(1);
        Integer i2 = new Integer("1");
        System.out.println(i1+"  "+i2);
        //利用静态方法
        Integer i3 = Integer.valueOf(123);
        Integer i4 = Integer.valueOf("123");
        Integer i5 = Integer.valueOf("123",16);
        System.out.println(i3+"  "+i4+"  "+i5);
        //两种方式的区别

    }
}
