package day1_Loops;

import java.util.Scanner;

public class Greater {
    public static void main(String[] args){
        int num1;
        int num2;
        int num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        int greater = num1;
        if(num2 > greater){
            greater = num2;
        };
        if(num3 > greater ){
            greater = num3;
        };
        System.out.println("Greater number : " + greater);
    }
}
