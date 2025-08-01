package day2_SwitchFunction;

import java.util.Scanner;

public class SwapValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 number to swap");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        //calling the function
        SwapTheValue(num1, num2);
    }

    //function to swap the value
    //pass by value ( no actual value going to change )
    static void SwapTheValue( int a, int b){
        System.out.println("Old value of a and b are " + a + " and " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("New value after swiping a and b are " + a + " and " + b);
    }
}
