package day4_LinearAlgoArray;

public class SearchInString {
    public static void main(String[] args) {
        String str = "Keshav";
        char isPresent = 'i';
        boolean ans = isPresent(str, isPresent);
        System.out.println(ans);
    }

    //function to find character inside a string
    static boolean isPresent(String str ,char isPresent ){
        for( int i = 0; i<str.length(); i++){
            if(str.charAt(i) == isPresent){
                return true;
            }
        };
        return false;
    }
}
