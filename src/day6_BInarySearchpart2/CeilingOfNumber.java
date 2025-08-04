package day6_BInarySearchpart2;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,5,7,8,9,11};
        int target = 1; //look for greater smallest number
        System.out.println(findCeiling(arr,target));
    }

    //function
    static int findCeiling(int [] arr , int target){
        int start = 0;
        int end = arr.length-1;
        if(target > arr[end]) return -1;
        int mid = start + (end - start)/2;

        while(start<=end){
            if(arr[mid] == target){
                return  arr[mid];
            }
            if(arr[mid] > target){
                end = mid-1;
            }else{
                start = mid+1;
            }
            mid = start + (end - start)/2;
        }
        return arr[mid];
    }
}
