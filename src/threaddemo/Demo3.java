package threaddemo;

import java.util.concurrent.Callable;

public class Demo3 implements Callable {
    @Override
    public Object call() throws Exception {
        int sum=0;
        for (int i = 0; i <= 100; i++) {
            sum+=i;
        }
        return sum;
    }
}
