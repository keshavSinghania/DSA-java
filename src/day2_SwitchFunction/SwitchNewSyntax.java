package day2_SwitchFunction;

import java.util.Scanner;

public class SwitchNewSyntax {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an number btw 1 - 7");
        int num = sc.nextInt();

        switch (num){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Please enter valid number");
        }
    }
}
