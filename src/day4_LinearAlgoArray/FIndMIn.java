package day4_LinearAlgoArray;

public class FIndMIn {
    public static void main(String[] args) {
        int [] arr = {24,3,5,35,1,-45,35};
        System.out.println(findMin(arr));
    }

    //function
    static int findMin(int[] arr){
        int min = arr[0];
        for(int i =0; i<arr.length; i++){
            if(arr[i]< min){
                min = arr[i];
            }
        };
        return min;
    }
}
