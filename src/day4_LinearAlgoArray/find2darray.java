package day4_LinearAlgoArray;

public class find2darray {
    public static void main(String[] args) {
        int [][] arr = {{1,3,4},{1,4,3},{2,3,5}};
        int element = -4;

        System.out.println(check(arr,element));
    }

    //function
    static boolean check(int[][] arr , int element){
        for(int[] a : arr){
            for( int b : a){
                if(b == element){
                    return true;
                }
            }
        };
        return false;
    }
}
