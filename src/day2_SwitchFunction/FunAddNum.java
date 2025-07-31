package day2_SwitchFunction;

import java.util.Scanner;

public class FunAddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        int result = add(a,b);
        System.out.println("your result is : " + result);

    }

    //function to return the sum of two number as integers
    static int add( int a, int b){
        return  a+b;
    }
}
