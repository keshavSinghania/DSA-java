package day4_LinearAlgoArray;

public class FindMinNum {
    public static void main(String[] args) {
        int[] arr = {2,4,42,5,0,3,-24};
        System.out.println(findMin(arr));
    }
    //function
    static int findMin(int[] arr){
        int min = arr[0];
        for(int a : arr){
            if(min > a){
                min = a;
            }
        };
        return min;
    }
}
