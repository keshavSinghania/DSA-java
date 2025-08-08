package day9_StriverBinarySearchQuestions;

public class AggressiveCow {
}


//https://www.naukri.com/code360/problems/aggressive-cows_1082559?isSignup=true&leftPanelTabValue=SUBMISSION
//import java.util.Arrays;
//public class Solution {
//    public static int aggressiveCows(int []stalls, int k) {
//        Arrays.sort(stalls);
//        int ans=0;
//        int start=1;
//        int maxDist = stalls[stalls.length-1] - stalls[0];//this is max distance possible btw cows
//        // for(int i=0; i<=maxDist; i++){
//        //     if(isThisMinDisPossible(stalls,i,k)){
//        //         ans = i;
//        //     }
//        // }
//
//        //using binary search instead
//        while(start<=maxDist){
//            int mid = start + (maxDist - start)/2;
//            if(isThisMinDisPossible(stalls,mid,k)){
//                ans = mid;
//                start = mid + 1;
//            }else{
//                maxDist = mid - 1;
//            }
//        }
//        return ans;
//    }
//
//    //function to check wheather this min distance is possible or not?
//    static boolean isThisMinDisPossible(int[] arr, int minDist, int k){
//        int cowPlaced = 1;
//        int indexDiff = arr[0];
//        for(int i=1; i<arr.length; i++){
//            int dist = arr[i]- indexDiff;
//
//
//            if(dist >= minDist){
//                cowPlaced++;
//                indexDiff=arr[i];
//            }
//            if(cowPlaced==k){
//                return true;
//            }
//        }
//        return false;
//    }
//}