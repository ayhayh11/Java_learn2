package searchdemo.binarysearchdemo;

public class Test1 {
    public static void main(String[] args) {
        //需求:定义一个方法利用二分查找，查询某个元素在数组中的索引
        // 数据如下:{7,23,79,81, 103,127,131,147}
        int[] arr={7,23,79,81, 103,127,131,147};
        int num=1999;
        System.out.println(binarysearch(arr, num));
    }
    public static int binarysearch(int[]arr,int num){
        int min=0;
        int max=arr.length-1;
        while(true){
            if(min> max){
                return -1;
            }
            int mid=(min+max)/2;
            if(num==arr[mid]){
                return mid;
            }
            if(num>arr[mid]){
                min=mid+1;
            }else{
                max=mid-1;
            }
        }
    }
}
