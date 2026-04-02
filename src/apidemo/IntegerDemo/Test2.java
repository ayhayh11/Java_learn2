package apidemo.IntegerDemo;

public class Test2 {
    public static void main(String[] args) {
        String str = Integer.toBinaryString(2);
        System.out.println(str);
        String str2 =Integer.toOctalString(100);
        System.out.println(str2);
        String str3 = Integer.toHexString(100);
        System.out.println(str3);
        //不是一种类型无法计算
        int i = Integer.parseInt("100");
        System.out.println(i+1);
        String str4="false";
        Boolean b = Boolean.parseBoolean(str4);
        System.out.println(b);
    }
}
