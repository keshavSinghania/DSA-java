public class GreatestLowestNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 11, 13, 17};
        int target = 17; // try 13, 1, 18 etc.

        int result = findStrictlyGreater(arr, target);
        System.out.println(result);
    }

    static int findStrictlyGreater(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                ans = arr[mid];     // possible answer, but let's find smaller one
                end = mid - 1;
            } else {
                start = mid + 1;    // move right if arr[mid] <= target
            }
        }

        return ans;
    }
}
