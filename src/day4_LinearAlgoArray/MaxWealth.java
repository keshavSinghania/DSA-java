package day4_LinearAlgoArray;

public class MaxWealth {
    public static void main(String[] args) {
        int [][] persons = {
                {4,5,2},//11
                {5,5,2},//12
                {990,1}//991 ans
        };

        System.out.println(maxWealth(persons));
    }

    //function to find maximum salary of person
    static int maxWealth(int[][] pers){
        int maxWealth = 0;
        for(int [] a : pers){
            int temp = sumArray(a);
            if(maxWealth < temp){
                maxWealth = temp;
            }
        }
        return maxWealth;
    }

    //function
    static int sumArray(int[] arr){
        int sum = 0;
        for(int a: arr){
            sum += a;
        }
        return sum;
    }
}
