package day2_SwitchFunction;

public class Overloading {
    public static void main(String[] args) {
        sum(1,7);
        sum(1,0,3);
        sum("Keshav", "Singhania");

    }
    //THREE DIFFERENT FUNCTIONS TO PERFORM SUM WITH SAME NAME
    // 1 -> JUST 2 ARGUMENTS [INT TYPE]
    // 2 -> 3 ARGUMENTS [ INT TYPE ]
    // 3-> 2 ARGUMENTS [ STRING TYPE]

     static void sum (int a, int b){
        System.out.println("Sum:" + (a+b));
    }
     static void sum (int a, int b, int c){
        System.out.println("Sum:" + (a + b + c));
    }
     static void sum (String a, String b){
        System.out.println("Sum:" + (a+b));
    }

}
