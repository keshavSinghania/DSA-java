package day4_LinearAlgoArray;

public class SearchElement {
    public static void main(String [] args){
        int[] arr = { 1,2,3,4,62,6};
        int toFind = 7;
        boolean ans =  isPresent(arr, toFind);
        System.out.println(ans);
    }

    //function to check weather element is present inside array or not
    static boolean isPresent(int[] arr, int toFind){
        for (int a : arr){
            if(a == toFind){
                return true;
            }
        }
        return false;
    }
}
