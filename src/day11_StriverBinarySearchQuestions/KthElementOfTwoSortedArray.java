package day11_StriverBinarySearchQuestions;

public class KthElementOfTwoSortedArray {
}

//https://www.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1

//class Solution {
//    public int kthElement(int a[], int b[], int k) {
//        // ensures that a[] < b[]
//        if(a.length>b.length) return kthElement(b,a,k);
//
//        int n1 = a.length;
//        int n2 = b.length;
//        int n = n1 + n2;
//        int start =0;
//        int end =  n1;
//
//        while(start<=end){
//            int i = start + (end - start)/2;
//            int j = k - i;
//
//
//            if (j < 0) {
//                end = i - 1;
//                continue;
//            }
//            if (j > n2) {
//                start = i + 1;
//                continue;
//            }
//
//            int l1 = (i==0) ? Integer.MIN_VALUE : a[i-1];
//            int r1 = (i==n1) ? Integer.MAX_VALUE : a[i];
//
//            int l2= (j==0) ? Integer.MIN_VALUE : b[j-1];
//            int r2 = (j==n2) ? Integer.MAX_VALUE: b[j];
//
//            if(l1<=r2 && l2<=r1){
//                return Math.max(l1,l2);
//            }else if(l1>l2){
//                end = i -1;
//            }else{
//                start = i + 1;
//            }
//        }
//
//        // //start picking all the element from a array and checing is it in sorted form
//        // for(int i = 0; i<=n1; i++){
//        //     int l1 = (i==0) ? Integer.MIN_VALUE : a[i-1];
//        //     int r1 = (i==n1) ? Integer.MAX_VALUE : a[i];
//
//
//        //     int j = k - i;
//
//        //      if (j < 0 || j > n2) continue;
//
//        //     int l2= (j==0) ? Integer.MIN_VALUE : b[j-1];
//        //     int r2 = (j==n2) ? Integer.MAX_VALUE: b[j];
//
//        //     //is this correctly sorted?
//
//        //     if(l1<=r2 && l2<=r1){
//        //         return Math.max(l1,l2);
//        //     }
//        // }
//        return -1;
//    }
//}