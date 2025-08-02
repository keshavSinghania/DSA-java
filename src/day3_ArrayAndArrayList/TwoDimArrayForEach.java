package day3_ArrayAndArrayList;

public class TwoDimArrayForEach {
    public static void main(String[] args){
        int[][] arr = {
                {1},
                {2, 3},
                {4, 5, 6}
        };

        //printing 2d array using for each

//        METHOD ONE
        for(int[] a: arr){
            for(int i = 0 ; i< a.length; i++){
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }

        //METHOD TWO
        for(int [] row: arr){
            for( int col : row){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
