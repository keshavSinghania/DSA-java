package day1_Loops;

import java.util.Scanner;

public class CountRepetition {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any Number");
        int mainNum = sc.nextInt();

        System.out.println("Enter a number for which repetition");
        int checkFor = sc.nextInt();

        int count = 0;

        while (mainNum > 0){
            int lastDigit = mainNum % 10;
            if(lastDigit == checkFor){
                count++;
            };
            mainNum = mainNum / 10; //shifting number by one place
        };

        System.out.println("Number of time " + checkFor + " repeated in number is " + count);
    }
}
