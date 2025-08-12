package day11_StriverBinarySearchQuestions;

public class MaxNumOfOnce {
}
//https://leetcode.com/problems/row-with-maximum-ones/
//class Solution {
//    public int[] rowAndMaximumOnes(int[][] mat) {
//        int maxCount = 0;
//        int index = 0;
//        for(int row=0; row<mat.length; row++){
//            int count = noOfKeys(mat[row],1,maxCount);
//            if(maxCount<count){
//                maxCount = count;
//                index = row;
//            }
//        }
//        return new int []{index,maxCount};
//    }
//
//    //function to count the max number of once
//    int noOfKeys(int[] arr, int key, int maxCount){
//        int count = 0;
//        for(int i=0; i<arr.length; i++){
//            if(key == arr[i]){
//                count++;
//            }
//        }
//        return count;
//    }
//}