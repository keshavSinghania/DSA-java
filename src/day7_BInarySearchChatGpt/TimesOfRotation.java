package day7_BInarySearchChatGpt;

public class TimesOfRotation {
    public static void main(String[] args) {
        int[] arr = {2,3,4,0,1};
        //the next index of peak element of rotated array is always equal to the smallest element of whole array and also index == rotated count
        int peak = findPeak(arr);
        if(peak == arr.length-1){
            System.out.println("No Of Rotation is = 0");
        } else{
            System.out.println("No Of Rotation is = " + (peak + 1));

        }
    }

    //function to find peak in rotated array
    static int findPeak(int[]arr){
        int start = 0;
        int end = arr.length - 1;
        while (start<end){
            int mid = start + (end - start)/2;
            //if we are right side and checking right with that condition that may never satisfy if it's a peak , so just cut right elements
            if(arr[mid] < arr[start]){
                end = mid - 1;
            } else { // we are at peak or at left side.... cut rest left side expect this element
                start = mid;
            }
        }
        return start;
    };

}
