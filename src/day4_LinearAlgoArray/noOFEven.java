package day4_LinearAlgoArray;

//to find to number of even digits elements present inside a given array
public class noOFEven {
    public static void main(String[] args) {
        int[] arr = {12,434,24,324,5456,466666,2710};//5
        System.out.println(findEvenCount(arr));
    }

    static int findEvenCount(int[] arr){
        int count = 0;
        for( int a : arr){
            if(isEvenDigit(a)){
                count++;
            }
        };
        return count;
    };

    static boolean isEvenDigit(int num){
        int count = 0;
        while (num>0){
            count++;
            num = num/10;
        }
        if(count % 2 == 0){
            return true;
        }
        return false;
    }
}
