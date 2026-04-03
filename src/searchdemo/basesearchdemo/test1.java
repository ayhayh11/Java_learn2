package searchdemo.basesearchdemo;

public class test1 {
    public static void main(String[] args) {
        //需求:定义一个方法利用基本查找，查询某个元素是否存在
        // 数据如下:{131,127,147,81,103,23,7,79}
        int[] arr={131,127,147,81,103,23,7,79};
        int num=7;
        System.out.println(basesearch(arr, num));
    }
    public static boolean basesearch(int[] arr,int num){
        for (int i = 0; i < arr.length; i++) {
            if(num==arr[i]){
                return true;
            }
        }
        return false;
    }
}
