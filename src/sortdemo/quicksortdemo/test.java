package sortdemo.quicksortdemo;


public class test {
    public static void main(String[] args) {
        //快速排序
        /*快速排序:
        第一轮:以索引的数字为基准数，确定基准数在数组中正确的位置。
        基准数小的全部在左边，比基准数大的全部在右边。
        后面以此类推。*/
        int[]arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        quickSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public  static  void quickSort(int[] arr,int left,int right){
        int start=left;
        int end=right;
        int basenumber=arr[left];
        if(start>=end){
            return;
        }
        while(start!=end){
            while(true){
                if(end<= start|| arr[end]<basenumber){
                    break;
                }
                end--;}
            while (true) {
                if(end<= start||arr[start]>basenumber){
                    break;
                }
                start++;
            }

            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
        int temp=arr[left];
        arr[left]=arr[ start];
        arr[ start]=temp;
        quickSort(arr, left, start-1);
        quickSort(arr, start+1, right);
    }
}
