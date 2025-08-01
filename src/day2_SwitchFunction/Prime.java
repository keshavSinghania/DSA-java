package day2_SwitchFunction;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check weather it's a prime or not");
        int num1 = sc.nextInt();
        if(isPrime(num1)){
            System.out.println("Yes Prime");
        } else{
            System.out.println("No it's not a prime number");
        }
    }

    //function to isprime
    static boolean isPrime(int a){
        if(a<=1){
            return false;
        }
        int temp = 2;

        while (temp<a){
            if((a*a) %  temp == 0){
                return false;
            }
            temp++;
        }
        return true;
    }
}
