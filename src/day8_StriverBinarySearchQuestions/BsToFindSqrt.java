package day8_StriverBinarySearchQuestions;

public class BsToFindSqrt {
    public static void main(String[] args) {
        int num = 37;
        System.out.println(SQRT(num));
    }

    //function to find sqrt using bs
    static int SQRT(int num){
        int start = 1;
        int end = num;
        int ans = 1;
        while (start<=end){
            int mid = start + (end - start)/2;
            if(mid * mid <= num){
                ans = mid;
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return  ans;
    }
}
