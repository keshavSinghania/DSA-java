package day12_StriverBinarySearchQuestions;

public class BinarySearchInSorted2dArray2 {
}

//https://leetcode.com/problems/search-a-2d-matrix-ii/
//class Solution {
//    public boolean searchMatrix(int[][] matrix, int target) {
//        int m = matrix.length; //matrix row size
//        int n = matrix[0].length; //matrix col size
//        int row = 0;
//        int col = n - 1;
//        while(row<m && col>=0){
//            if(matrix[row][col] == target){
//                return true;
//            }else if(matrix[row][col]>target){
//                col--;
//            }else {
//                row++;
//            }
//        }
//        return false;
//    }
//}