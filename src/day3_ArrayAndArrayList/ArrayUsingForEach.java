package day3_ArrayAndArrayList;

import java.util.Scanner;

public class ArrayUsingForEach {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] myArray = new int[5];

        //initializing array
        System.out.println("Input your array please!");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = sc.nextInt();
        }

        //printing array
        System.out.println("Printing your array");
        for(int a: myArray){
            System.out.println(a);
        }
    }
}
