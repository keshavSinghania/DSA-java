package day4_LinearAlgoArray;

public class CharInStr {
    public static void main(String[] args) {
        String str = "keshav";
        char isPresent = 'o';

        System.out.println(Check(str, isPresent));
    }

    //function

    static boolean Check(String str , char isPresent){
        for(char a : str.toCharArray()){
            if(a == isPresent){
                return true;
            }
        };
        return false;
    }
}
