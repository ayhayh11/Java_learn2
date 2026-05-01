package threaddemo;

public class Demo1Test {
    public static void main(String[] args) {
        Demo1 t1 = new Demo1();
        Demo1 t2 = new Demo1();
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();
    }
}
