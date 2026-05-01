package threaddemo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Demo3Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Demo3 d1 = new Demo3();
        FutureTask<Integer> ft=new FutureTask<>(d1);
        Thread t1=new Thread(ft);
        t1.start();
        System.out.println(ft.get());
    }
}
