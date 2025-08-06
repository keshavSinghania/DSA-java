package day7_BInarySearchChatGpt;

public class MountainPeak {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 0, -1, -2};// ans = 5;
        System.out.println(findPeak(arr));

    }

    static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        if (start == end) {
            return arr[0];
        }
        if (arr[0] > arr[1]) {
            return arr[0];
        }
        if (arr[end] > arr[end - 1]) {
            return arr[end];
        }

        // binary search
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return arr[mid];
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}