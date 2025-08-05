package day7_BInarySearchChatGpt;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,5,5,5,6,3,2,0}; //ans = 4
        System.out.println(peak(arr));
    }

    //function to find peak element
    static int peak(int[] arr){
        int start = 0;
        int end= arr.length -1;
        int mid = start + (end-start)/2;
        while (start<end){
           if(arr[mid] >= arr[mid+1]){ //right
               end = mid;
           }else{
               start= mid+1;
           }
            mid = start + (end-start)/2;
        }
        return start;
    }
}
