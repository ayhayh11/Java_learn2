package apidemo.regexdemo;

public class Test2 {
    public static void main(String[] args) {
        //利用正则表达式判断手机号码是否正确
        String phone = "1[3-9]\\d{9}";
        System.out.println("13507793456".matches( phone));
        System.out.println("1350779345".matches( phone));
        System.out.println("________________________________");
        //利用正则表达式判断座机号码是否正确
        String tel = "0\\d{2,3}-?[1-9]\\d{4,9}";
        System.out.println("010-12345678".matches( tel));
        System.out.println("01012345678".matches( tel));
        System.out.println("12323612731283781268736278".matches( tel));
        System.out.println("________________________________");
        //利用正则表达式判断邮箱是否正确
        String email = "\\w+@[\\w\\.]+\\.[a-zA-Z]{2,6}";
        System.out.println("<EMAIL>".matches( email));
        System.out.println("965317623@qq.com".matches( email));
    }
}
