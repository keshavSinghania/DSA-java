package day12_StriverBinarySearchQuestions;

public class BinarySearchInSorted2dArray1 {
}

//https://leetcode.com/problems/search-a-2d-matrix/

//class Solution {
//    public boolean searchMatrix(int[][] matrix, int target) {
//        int start = 0;
//        int m = matrix.length;
//        int n = matrix[0].length;
//        int end = (m*n) - 1;
//        while(start<=end){
//            int mid = start + (end - start)/2;
//            int midValue = matrix[mid/n][mid%n];
//
//            if(midValue == target){
//                return true;
//            }else if(midValue>target){
//                end = mid - 1;
//            }else{
//                start = mid + 1;
//            }
//        }
//        return false;
//    }
//}