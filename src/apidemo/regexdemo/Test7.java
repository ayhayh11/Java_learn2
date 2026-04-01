package apidemo.regexdemo;

public class Test7 {
    public static void main(String[] args) {
        /*需求:
          将字符串:我要学学编编编编程程程程程程
          替换为:我要学编程*/
        String str = "我要学学编编编编程程程程程程";
        //(.)表示首字母看成一组
        //\\1表示第一个字符再次出现
        //+表示匹配一个或多个
        //$1表示在正则中第一组内容，在拿到外部来使用就用$符号
        //分组以左括号“（”开始来判断
        String s = str.replaceAll("(.)\\1+", "$1");
        System.out.println(s);
    }
}
