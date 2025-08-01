package day2_SwitchFunction;

import java.util.Scanner;

public class CelToFehConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a temperature in Calsius to convert into Fehrenheit");
        int cValue = sc.nextInt();
        int fValue = C2F(cValue);
        System.out.println(cValue + "C  =  " + fValue + "F");
    }

    //function to covert celsius value into fehrenheit
    static int C2F(int cValue){
        int fValue = ( cValue * 9/5) + 32;
        return  fValue;
    }
}
