package day3_ArrayAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class SwapArrayIndexes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArr = {1,2,3,4,5,6,7,8,9};
        System.out.println("Array before swapping");
        System.out.println(Arrays.toString(myArr));
        System.out.println("Array after swapping");
        swapTheIndex(myArr,0,1);
        System.out.println(Arrays.toString(myArr));
    }

    //function to swap the index of array
    static void swapTheIndex(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
