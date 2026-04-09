package Collectiondemo.setdemo.treesetdemo;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private double chinese;
    private double math;
    private double english;

    public Student() {
    }

    public Student(String name, int age, double chinese, double math, double english) {
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return chinese
     */
    public double getChinese() {
        return chinese;
    }

    /**
     * 设置
     *
     * @param chinese
     */
    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    /**
     * 获取
     *
     * @return math
     */
    public double getMath() {
        return math;
    }

    /**
     * 设置
     *
     * @param math
     */
    public void setMath(double math) {
        this.math = math;
    }

    /**
     * 获取
     *
     * @return english
     */
    public double getEnglish() {
        return english;
    }

    /**
     * 设置
     *
     * @param english
     */
    public void setEnglish(double english) {
        this.english = english;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", chinese = " + chinese + ", math = " + math + ", english = " + english + "}";
    }

    @Override
    public int compareTo(Student o) {
        //按照总分升序，
        // 如果总分一样按照语文排序，如果语文一样按照数学排序，如果数学一样按照英语排序，
        // 如果英语一样按照年龄排序，如果年龄一样按照字母顺序排序，如果都一样认为是一个学生不排序
        double sum = this.getChinese() + this.getMath() + this.getEnglish();
        double sum1 = o.getChinese() + o.getMath() + o.getEnglish();
        double v = sum - sum1;
        v = v == 0 ? this.getChinese() - o.getChinese() : v;
        v = v == 0 ? this.getMath() - o.getMath() : v;
        v=v==0?this.getEnglish()-o.getEnglish():v;
        v=v==0?this.getAge()-o.getAge():v;
        v=v==0?this.getName().compareTo(o.getName()):v;
        return (int) v;
    }
}
