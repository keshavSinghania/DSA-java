package day2_SwitchFunction;

import java.util.Scanner;

public class swapUsingArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int [] myarr = new int[2];

        System.out.println("Enter 2 value to swap");
        for( int i = 0; i < myarr.length; i++){
            myarr[i] = sc.nextInt();
        }

        System.out.println("Your array value before swaping " + myarr[0] + " " + myarr[1]);
        swapTheValue(myarr);
        System.out.println("Your array value after swaping " + myarr[0] + " " + myarr[1]);
    };

    //function to swap the value
    static void swapTheValue( int[] arr){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}
