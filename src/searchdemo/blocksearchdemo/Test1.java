package searchdemo.blocksearchdemo;

public class Test1 {
    public static void main(String[] args) {
        //分块查找
       //定义一个blockarr存放每一块对象的信息；
        //先查找属于那一块对象
        //然后遍历对象；
        int[] arr={16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50,48, 61, 52, 73,66};
        int num=52;
        block b1=new block(21,0,5,5);
        block b2=new block(45,6,11,23);
        block b3=new block(73,12,17,48);
        block[] blockarr={b1,b2,b3};
        System.out.println(getindex(blockarr, num, arr));


    }
    public static  int getindex(block[] blockarr,int num,int[] arr){
        int index=findindexblock(blockarr,num);
        if(index==-1){
            System.out.println("没有找到");
        }
        int startindex=blockarr[index].getStartindex();
        int endindex=blockarr[index].getEndindex();
        for (int i = startindex; i <=endindex; i++) {
            if(arr[i] == num){
                return i;
            }
        }
        return  -1;
    }
    public static int findindexblock(block[] blockarr,int num){
        for (int i = 0; i < blockarr.length; i++) {
            if(num<=blockarr[i].getMax()&&num>=blockarr[i].getMin()){
                return i;
            }
        }
        return -1;
    }

}
class  block{
    int max;
    int min;
    int startindex;
    int endindex;

    public block(int max, int startindex, int endindex,int min ) {
        this.max = max;
        this.startindex = startindex;
        this.endindex = endindex;
        this.min=min;
    }

    public block() {
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getStartindex() {
        return startindex;
    }

    public void setStartindex(int startindex) {
        this.startindex = startindex;
    }

    public int getEndindex() {
        return endindex;
    }

    public void setEndindex(int endindex) {
        this.endindex = endindex;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }
}
