package day7_BInarySearchChatGpt;

public class NextBS {
    public static void main(String[] args) {
        int [] arr = {1,3,5,6};
        int target = 5;// 2
        int target1 = 2;//1
        int target2 = 7; //4
        System.out.println(ansIndex(arr,target2));
    }

    //function
    static int ansIndex(int[] arr ,int target){
        int start =0;
        int end = arr.length -1;
        int mid = start + (end -start)/2;

        while (start<=end){
            if(arr[mid] == target){
                return mid;
            } else if(arr[mid] > target){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start)/2;
        }
        return start;
    }
}
