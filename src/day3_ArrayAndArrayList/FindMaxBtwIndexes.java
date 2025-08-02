package day3_ArrayAndArrayList;

public class FindMaxBtwIndexes {
    public static void main(String[] args){
        int[] arr = { 1, 24 , 100 , 2311, 101, 999};
        System.out.println(findMaxBtw(arr,1 , 4));
    }

    //function to find maximum value btw given indexes
    static int findMaxBtw(int[] myArr, int start, int end){
        int maxValue = myArr[start];
        for( int i = start; i<=end; i++){
            if(maxValue< myArr[i]){
                maxValue = myArr[i];
            }
        };
        return  maxValue;
    }
}
