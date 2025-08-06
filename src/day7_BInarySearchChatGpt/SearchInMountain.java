package day7_BInarySearchChatGpt;

public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 8, 12, 43, 9, 6, 5, 3, 1};
        int target = 10;

        int peak = findPeakIndex(arr);

        // Search in ascending part
        boolean left = BS(arr, target, 0, peak, true);
        if (left) {
            System.out.println("Found");
            return;
        }

        // Search in descending part
        boolean right = BS(arr, target, peak + 1, arr.length - 1, false);
        if (right) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }

    // Function to find peak index
    static int findPeakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    // Modified binary search for both ascending/descending
    static boolean BS(int[] arr, int target, int start, int end, boolean asc) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return true;
            }

            if (asc) {
                if (arr[mid] > target) end = mid - 1;
                else start = mid + 1;
            } else {
                if (arr[mid] < target) end = mid - 1;
                else start = mid + 1;
            }
        }
        return false;
    }
}
