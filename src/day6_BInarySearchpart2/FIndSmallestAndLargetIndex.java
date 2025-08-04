package day6_BInarySearchpart2;

import java.util.Arrays;

public class FIndSmallestAndLargetIndex {
    public static void main(String[] args) {
        int [] arr = {1,2,2,2,3,5,9}; //[1,3]
        int [] arr1 = {1,2,2,3,5,9}; //[1,2]
        int [] arr2 = {1,2,3,5,9}; //[1,1];//exception case
        int [] arr3 = {1,4,5,7};//[-1,-1];
        int target = 2; //[1,3]

        int [] ans = {-1,-1};
        ans[0] = toFind(arr, target, false);
        ans[1] = toFind(arr, target, true);
        System.out.println(Arrays.toString(ans));
    }
    //function
    static int toFind(int[] arr , int target, boolean isLargestIndex){
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start)/2;
        int ans = -1;
        while(start <= end){
            if(target == arr[mid]){
                ans = mid;
                if(isLargestIndex){
                    start = mid + 1;
                }else{
                    end = mid -1;
                }
            }
            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid -1;
            }

            mid = start + (end - start)/2;
        };
        return ans;
    }
}
