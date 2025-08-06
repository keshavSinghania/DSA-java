package day7_BInarySearchChatGpt;

public class MinElementInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr ={0,1,2,3,4,5,6,7,8,9};
        System.out.println(find(arr));

    }
    //function to find minimum element in rotated sorted array
    static int find(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int ans = Integer.MAX_VALUE;
        while (start<=end){
            int mid = start + ( end - start)/2;
            if(arr[mid]>=arr[start]){
                ans = min(ans,arr[start]);
                start = mid+1;
            }
            else{
                ans = min(ans, arr[mid]);
                end = mid-1;
            }
        }
        return ans;
    }

    //function to find min
    static int min(int a, int b){
        if(a<b){
            return a;
        }else{
            return b;
        }
    }
}
