package day10_StriverBinarySearchQuestions;

public class SplitArrayLargestSum {
}

//SplitArrayLargestSum
//https://leetcode.com/problems/split-array-largest-sum/
//
//class Solution {
//    public int splitArray(int[] nums, int k) {
//        int start = max(nums);
//        int end = sum(nums);
//        int ans = -1;
//        while(start<=end){
//            int mid = start + (end - start)/2;
//            if(isValid(nums,mid,k)){
//                ans = mid;
//                end = mid - 1;
//            }else{
//                start = mid + 1;
//            }
//        }
//        return ans;
//    }
//
//    //function to check wheather spliting with or within passed maximum number or not
//    boolean isValid(int[] nums, int max, int k){
//        int splittedPart = 1;
//        int totalSum = 0;
//        for(int i=0; i<nums.length; i++){
//            if(totalSum + nums[i] <=max){
//                totalSum+=nums[i];
//            }else{
//                totalSum = nums[i];
//                splittedPart ++;
//                if(k<splittedPart){
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//
//    //function ot find sum of an array
//    int sum(int[] arr){
//        int sum =0;
//        for(int a: arr){
//            sum+=a;
//        }
//        return sum;
//    }
//
//    //function to find max value of an array
//    int max(int[] arr){
//        int max = arr[0];
//        for(int i = 1; i<arr.length; i++){
//            if(max<arr[i]){
//                max = arr[i];
//            }
//        }
//        return max;
//    }
//}

////