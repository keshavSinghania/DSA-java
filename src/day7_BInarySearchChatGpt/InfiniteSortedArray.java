package day7_BInarySearchChatGpt;

public class InfiniteSortedArray {

    public static void main(String[] args) {
        int[] arr = {1, 6, 7, 9, 10, 12, 15, 20, 25, 30};
        int target = 15;

        int index = findInInfiniteArray(arr, target);
        System.out.println("Target found at index: " + index);
    }

    // Main function to find target in simulated infinite array
    static int findInInfiniteArray(int[] arr, int target) {
        int start = 0;
        int end = 1;

        // Expand range until target <= arr[end]
        while (get(arr, end) < target) {
            int newStart = end + 1;
            // double the window size
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return binarySearch(arr, target, start, end);
    }

    // Simulated safe access to infinite array
    static int get(int[] arr, int index) {
        if (index >= arr.length) return Integer.MAX_VALUE;
        return arr[index];
    }

    // Classic binary search
    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midValue = get(arr, mid);

            if (midValue == target) return mid;
            if (midValue > target) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }
}
