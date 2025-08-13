package day12_StriverBinarySearchQuestions;

public class FindPeakElementIn2DArrayUsingBS {
}

//https://leetcode.com/problems/find-a-peak-element-ii/


//class Solution {
//    public int[] findPeakGrid(int[][] mat) {
//        int m = mat.length;
//        int n = mat[0].length;
//        int start = 0;
//        int end = n-1;
//        while(start<=end){
//            int mid = start+(end-start)/2;
//            //find maximum element in mid col
//            int maxIndex = findMax(mat,mid,m);
//            //comparing max from left and right to check wheather its peak or not
//            int left = mid<=0  ? -1 : mat[maxIndex][mid-1];
//            int right = mid>=n-1 ? -1 : mat[maxIndex][mid+1];
//            if(mat[maxIndex][mid] > left && mat[maxIndex][mid]>right){
//                return new int[] {maxIndex,mid};
//            }else if(mat[maxIndex][mid]<left){
//                //cut right
//                end = mid - 1;
//            }else{
//                start = mid + 1;
//            }
//        }
//        return new int[] {-1,-1};
//    }
//    //function to find max element in column
//    int findMax(int[][] arr, int col, int rowLength){
//        int max = arr[0][col];
//        int maxIndex = 0;
//        for(int i=1; i<rowLength; i++){
//            if(max < arr[i][col]){
//                max = arr[i][col];
//                maxIndex = i;
//            }
//        }
//        return maxIndex;
//    }
//}