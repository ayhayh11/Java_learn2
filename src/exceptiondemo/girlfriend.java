package exceptiondemo;

public class girlfriend {
    private String name;
    private int age;

    public girlfriend() {
    }

    public girlfriend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        int length = name.length();
        if(length<3||length>10){
            throw new RuntimeException("姓名长度不正确");
        }
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        if(age<18||age>40){
            throw new RuntimeException("年龄范围不正确");
        }
        this.age = age;
    }

    public String toString() {
        return "girlfriend{name = " + name + ", age = " + age + "}";
    }

}
