package java1loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, result = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the position (n):");
        int num = sc.nextInt();

        if (num == 0) {
            result = 0;
        } else if (num == 1) {
            result = 0;
        } else if (num == 2) {
            result = 1;
        } else {
            for (int i = 3; i <= num; i++) {
                result = a + b;
                a = b;
                b = result;
            }
        }

        System.out.println("Fibonacci number at position " + num + " is: " + result);
    }
}
