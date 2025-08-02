package day3_ArrayAndArrayList;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,7,8,9};
        System.out.println("Your original array");
        System.out.println(Arrays.toString(arr));

        Reverse(arr);

        System.out.println("Your reversed array");
        System.out.println(Arrays.toString(arr));
    }

    //function to reverse the array
    static void Reverse(int []arr){
        int start = 0;
        int last =  arr.length - 1;
        while (start < last){
            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            start++;
            last--;
        }
    }
}
