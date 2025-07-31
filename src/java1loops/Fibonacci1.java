package java1loops;

import java.util.Scanner;

public class Fibonacci1 {
    public static void main(String[] args){
        int a = 0;
        int b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter position");
        int num = sc.nextInt();
        if(num<=0){
            System.out.println("Must Enter valid position");
            return;
        }
        if(num==1){
            System.out.println("Your Fibonacci number is : " + 0);
            return;
        }
        int count = 3;
        while(count<= num){
            int temp = a+b;
            a = b;
            b = temp;
            count ++;
        }
        System.out.println("You fibonacci number at position " + num + " is " + b);
    }
}
