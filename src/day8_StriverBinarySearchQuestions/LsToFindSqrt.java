package day8_StriverBinarySearchQuestions;

public class LsToFindSqrt {
    public static void main(String[] args) {
        int num = 56;
        System.out.println(findSQRT(num));
    }

    //function to find sqrt of given number
    static int findSQRT(int num){
        int ans = 1;
        for(int i = 0; i<=num; i++){
            if(i * i <= num){
                ans = i;
            }else{
                break;
            }
        }
        return ans;
    }
}
