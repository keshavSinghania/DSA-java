package day2_SwitchFunction;

import java.util.Scanner;

public class SwitchNewPart2 {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number according to week day");
        int num = sc.nextInt();

        switch (num){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
        }
    }
}
