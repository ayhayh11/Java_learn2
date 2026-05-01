package threaddemo;

public class Demo2Test {
    public static void main(String[] args) {
        Demo2 d1 = new Demo2();
        Demo2 d2 = new Demo2();
        Thread t1=new Thread(d1);
        Thread t2=new Thread(d2);
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();
    }
}
