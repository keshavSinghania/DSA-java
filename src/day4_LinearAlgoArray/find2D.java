package day4_LinearAlgoArray;

public class find2D {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int element = -5;
        System.out.println(IsPresent(arr,element));
    }

    //function
    static boolean IsPresent( int[][] arr , int element){
        for(int row =0 ; row< arr.length; row++){
            for( int col = 0; arr[row].length >col; col++){
                if(arr[row][col] == element){
                    return true;
                }
            }
        };
        return false;
    }

}
