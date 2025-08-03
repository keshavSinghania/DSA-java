package day4_LinearAlgoArray;

public class LinearSearchIndex {
    public static void main(String[] args) {
        int[] arr = {45,43,545,45,1,47,54};
        int toFind = 545;
        int ans = findElementIndex(arr, toFind);
        System.out.println(ans);
    };

    static int findElementIndex(int[] arr , int toFind){
        for (int i = 0; i< arr.length; i++){
            if(toFind == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
