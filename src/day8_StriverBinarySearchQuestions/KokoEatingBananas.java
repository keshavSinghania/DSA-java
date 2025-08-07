package day8_StriverBinarySearchQuestions;

public class KokoEatingBananas {
}

//DONE SOULTION IS https://leetcode.com/problems/koko-eating-bananas/
//USER ID keshavks13
//class Solution {
//
//    /*important
//    K = how much bananas / hr;
//    int[] piles = array of piles (each pile contains some number of bananas);
//    int h = how much hours she have.....
//    */
//    public int minEatingSpeed(int[] piles, int h) {
//        int end = getMax(piles);
//        int start = 1;
//        int ans = -1;
//        while(start<=end){
//            int mid = start + ( end - start)/2;
//            /*check if mid is possible ans , to be mid a possible ans must
//                     (doesSheAbleToEatBananas) returns true
//            */
//            if(doesSheAbleToEatBananas(piles,mid,h)){
//                ans = mid;
//                end = mid - 1;
//            }else{
//                start = mid + 1;
//            }
//        }
//        return ans;
//    }
//
//    /*
//    function to check would she able to eat bananas for some value of K ,
//    in given H hrs..
//    if hrs exceeds return fasle else true
//    */
//    boolean doesSheAbleToEatBananas(int[]piles , int k, int h){
//        int totalHrSheTaking = 0;
//        for(int i =0 ; i<piles.length; i++){
//            //adding time of each pile
//            totalHrSheTaking += timeTakesToEatOnePile(k,piles[i]);
//            //if total hr she taking exceeds than totol hrs she has .. break or return false
//            if(totalHrSheTaking>h){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    //function to calculate time takes by koko to eat one pile of banana (ciel dividion)
//    int timeTakesToEatOnePile(int k, int num){
//        return (int) Math.ceil((double)num/k);
//    }
//
//    //function to find maximum value of unsorted array
//    int getMax(int[] arr){
//        int ans = arr[0];
//        for(int i = 1; i<arr.length; i++){
//            if(ans<arr[i]){
//                ans = arr[i];
//            }
//        }
//        return ans;
//    }
//}
//
