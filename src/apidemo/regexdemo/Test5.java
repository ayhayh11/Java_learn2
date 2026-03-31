package apidemo.regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test5 {

    public static void main(String[] args) {
        String s="jkshdjahdjhakjabbbbbbbbb";
        //爬取ab+
        String regex="ab+?";
        //Java默认的是贪婪爬取，贪婪爬取：尽可能多的匹配
        //非贪婪爬取：尽可能少的匹配就再+ *加个？
        Pattern p=Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}

