package apidemo.testdemo;

public class Test3 {
    public static void main(String[] args) {
        //定义一个方法实现tobinaryString方法,
        // 将十进制转换为二进制
        System.out.println(toBinaryString(13333));
        System.out.println(Integer.toBinaryString(13333));
    }

    public static String toBinaryString(int number) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (number == 0) {
                break;
            }
            sb.append(number % 2);
            //sb.insert(0, number % 2);
            number = number /= 2;
        }
        return sb.reverse().toString();

    }
}
