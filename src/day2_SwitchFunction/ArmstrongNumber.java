package day2_SwitchFunction;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a three digits number to check weather it is armstrong or not");
        int num = sc.nextInt();
        System.out.println(isArmstrong(num));
    }

    //function to check three digits number is armstrong or not
    static boolean isArmstrong(int num){
        int originalNum = num;
        int newNumber = 0;
        while( num > 0){
            int lastDigit = num % 10;
            newNumber = (lastDigit * lastDigit * lastDigit) + newNumber;
            num /= 10;
        }
        return newNumber == originalNum;
    }
}
