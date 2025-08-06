package day7_BInarySearchChatGpt;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
//        int[] arr = {12,15,17,1,2,4,5,6,8,9};
        int[] arr = {2,5,6,0,0,1,2};
        int target = 0;
        System.out.println(search(arr,target));
    }
    //function to search element in rotated sorted array
    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start<=end){
            int mid = start + (end - start)/2;
            //CASE 1: if mid is target
            if(arr[mid] == target){
                return mid;
            }
            //if left is sorted
            if (arr[mid]>=arr[start]){
                //check is there any probability to target element btw left sorted array, if yes cut right else cut right
                if(target>=arr[start] && target<arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else {//if right is sorted
                //if present btw right sorted array cut left else cut right
                if (arr[mid] < target && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
