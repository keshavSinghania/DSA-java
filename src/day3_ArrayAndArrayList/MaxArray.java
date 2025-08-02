package day3_ArrayAndArrayList;

public class MaxArray {
    public static void main(String[] args){
        int[] myArr = {2,4,335,5,243,54};
        System.out.println(findMax(myArr));
    }

    //function to find the maximum value of inside array
    static int findMax(int[] arr){
        int maxValue = arr[0]; //assume first index of array with maximum value
        for(int a : arr){
            if(maxValue < a ){
                maxValue = a;
            }
        };
        return  maxValue;
    }
}
