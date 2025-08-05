package day7_BInarySearchChatGpt;

public class FirstBadVersion {

    static int bad = 4;

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7};
        System.out.println("First bad version is: " + firstBadVersion(arr));
    }

    static int firstBadVersion(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start)/2;
        int ans = -1;
        while (start<=end){
            if(isBadVersion(arr[mid])){
                ans = arr[mid];
                end = mid-1;
            } else{
                start =mid +1;
            }
            mid = start + (end - start)/2;
        }
        return ans;
    }

    static boolean isBadVersion(int version) {
        return version >= bad;
    }
}
