package day5_BinarySearchPart1;

public class BinarySearchOrderAgnostic {
    public static void main(String[] args) {
        int[] arr = {99,75,45,23,12,1}; //dec
        int target = 12;
        int[] arr1 = {1,3,4,5,7};//asce
        int target2 = 5;
        System.out.println(binaryS(arr,target));
        System.out.println(binaryS(arr1,target2));
    }
    //case for ascend target is greater than mid then start = mid+1, or wise end = mid-1;
    //case for descending ,if the target is smaller, then start = mid+1 or wise end = mid-1;

    //function to imp binary search
    static int binaryS(int [] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[0] < arr[end];
        int mid = start + (end - start)/2;
        while (start<=end){
            if(arr[mid] == target){
                return mid;
            }
            //for asc
            if(isAsc){
                if(target > arr[mid]){
                    start = mid + 1;
                }
                else {
                    end = mid-1;
                }
            }else{
                //des
                if(target < arr[mid]){
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }
            mid = start + (end - start)/2;
        }
        return -1;
    }
}
