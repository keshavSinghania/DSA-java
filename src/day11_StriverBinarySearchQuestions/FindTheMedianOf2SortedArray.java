package day11_StriverBinarySearchQuestions;

public class FindTheMedianOf2SortedArray {
}


//https://leetcode.com/problems/median-of-two-sorted-arrays/

//class Solution {
//    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        /*
//        checking wheather first element is smaller than second or not,
//        if not again calling this function with opposite argument
//        */
//        if(nums2.length<nums1.length) return findMedianSortedArrays(nums2,nums1);
//
//        int n1 = nums1.length;
//        int n2 = nums2.length;
//        int n = n1+n2;
//        int midLength = n/2;
//        int start = 0;
//        int end = n1;
//        //i represents number of elements picked from num1 [left side ]
//        //j represets number of elements picked from num2 [left side]
//
//        // BINARY SEARCH
//        while(start<=end){
//            int i = start+(end - start)/2;
//            int j = midLength - i;
//
//            int l1 = (i==0) ? Integer.MIN_VALUE : nums1[i-1];
//            int r1 = (i==n1) ? Integer.MAX_VALUE : nums1[i];
//
//            int l2 = (j==0) ? Integer.MIN_VALUE : nums2[j-1];
//            int r2 = (j==n2) ? Integer.MAX_VALUE : nums2[j];
//
//            if(l1<=r2 && l2<=r1){
//                //is this even
//                if(n%2 == 0){
//                    return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
//                }else{
//                    return Math.min(r1,r2);
//                }
//            }
//            else if(l1 > r2){
//                end = i - 1;
//            } else{
//                start = i + 1;
//            }
//        }
//
//        // LINEAR SEARCH
//        // for(int i = 0; i<=n1; i++){
//        //     int l1 = (i==0) ? Integer.MIN_VALUE : nums1[i-1];
//        //     int r1 = (i==n1) ? Integer.MAX_VALUE : nums1[i];
//
//        //     int j = midLength - i;
//
//        //     int l2 = (j==0) ? Integer.MIN_VALUE : nums2[j-1];
//        //     int r2 = (j==n2) ? Integer.MAX_VALUE : nums2[j];
//
//        //     if(l1<=r2 && l2<=r1){
//        //         //is this even
//        //         if(n%2 == 0){
//        //             return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
//        //         }else{
//        //             return Math.min(r1,r2);
//        //         }
//        //     }
//        // }
//        return 0.0;
//    }
//}
