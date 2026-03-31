package apidemo.regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test4 {
    public static void main(String[] args) {
        /*有如下文本，请按照要求爬取数据。
        Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，因为这两个是长期支持版本，
        下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台
        需求1:爬取版本号为8,11,17的Java文本，但是只要Java，不显示版本号。
        需求2:爬取版本号为8,11,17的Java文。正确爬取结果为:Java8 Java11 Java17 Java17
        需求3:爬取除了版本号为8,11,17的Java文本，*/
        String text = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多是Java8和Java11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";
        String regex = "（(?i)Java）(?=8|11|17)";
        String regex2 = "Java(8|11|17)";
        String regex3 =  "((?i)Java)(?:8|11|17)";
        String regex4 =  "((?i)Java)(?!8|11|17)";

        Pattern p = Pattern.compile(regex4);
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
