package apidemo.regexdemo;

public class Test6 {
    public static void main(String[] args) {
      /*  有一段字符串:小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠
    要求1:把字符串中三个姓名之间的字母替换为vs
    要求2:把字符串中的三个姓名切割出来*/
        String str = "小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠";
     /*   String vs = str.replaceAll("[a-zA-Z0-9]+", "vs");
        System.out.println(str);
        System.out.println(vs);*/
        String[] names = str.split("[a-zA-Z0-9]+");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
