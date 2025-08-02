package day3_ArrayAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] myArray = new int [10];
//        myArray[1] = 1;

     //initializing array using for loop
        System.out.println("Enter the values for your array");
        for( int i =0; i<myArray.length; i ++){
            myArray[i] = sc.nextInt();
        }

      //displaying array using for loop
        System.out.println("Printing you array ");
      for( int i =0 ; i< myArray.length; i++){
          System.out.print(myArray[i] + " ");
      }
    }
}
