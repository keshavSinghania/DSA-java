package day5_BinarySearchPart1;

public class BInarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,7,87,99};
        int target = 99;

        System.out.println(isFind(arr,target));
    }
    //to move left side end = mid-1
    //to move right side start = mid+1
    //function
    static int isFind(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) /2 ;
        while(start<=end){
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid]>target){
                end = mid-1;
            }else {
                start = mid+1;
            }
            mid = start + (end - start) /2;
        }
        return -1;
    }
}
