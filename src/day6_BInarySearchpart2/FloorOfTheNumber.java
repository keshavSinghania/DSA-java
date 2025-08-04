package day6_BInarySearchpart2;

public class FloorOfTheNumber {
    public static void main(String[] args){
        int [] arr = { 1,2,4,5,6,7,8,9};
        int target = 0;//2
        //to find a num which is either == target , or smaller greatest number;
        System.out.println(findFloor(arr,target));
    };

    //function
    static int findFloor(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start)/2;

        if(arr[start] > target){
            return -1;
        }
        while(start<=end){
            if(arr[mid] == target){
                return  arr[mid];
            }
            if(arr[mid]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }
            mid = start + (end - start)/2;
        };
        return arr[end];
    }
}
