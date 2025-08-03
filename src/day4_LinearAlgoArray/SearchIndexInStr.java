package day4_LinearAlgoArray;

public class SearchIndexInStr {
    public static void main(String[] args) {
        String str = "Keshav";
        char isPre ='o';
        System.out.println(IsPresent(str, isPre));
    }

    //function
    static int IsPresent(String str , char isPre){
        for(int i = 0 ; i<str.length(); i++){
            if(str.charAt(i) == isPre){
                return i;
            }
        };
        return -1;
    }
}
