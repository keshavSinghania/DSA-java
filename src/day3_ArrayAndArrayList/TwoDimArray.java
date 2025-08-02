package day3_ArrayAndArrayList;

import java.util.Scanner;

public class TwoDimArray {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int[][] arr2D = new int[3][3];

        //initializing 2d array using for loop
        System.out.println("Enter array elements!");
        for( int row = 0; row < arr2D.length; row++){
            for( int col = 0; col < arr2D[row].length; col++ ){
                arr2D[row][col] = sc.nextInt();
            }
        }

        //printing array
        System.out.println("Displaying your array");
        for( int row=0; row<arr2D.length; row++){
            for( int col = 0 ; col < arr2D[row].length; col++){
                System.out.print(arr2D[row][col] + " ");
            }
            System.out.println();
        }
    }
}
