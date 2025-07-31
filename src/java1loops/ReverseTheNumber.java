package java1loops;

import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number you wanna reverse");
        int num = sc.nextInt();

        int reversedNum = 0;
        while( num > 0 ){
            int lastNum = num % 10; //remainder
            reversedNum = (reversedNum * 10) + lastNum;
            num /= 10;
        }
        System.out.println("Your reverse number is " + reversedNum);
    }
}
