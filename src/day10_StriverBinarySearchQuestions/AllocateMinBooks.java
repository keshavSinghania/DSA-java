package day10_StriverBinarySearchQuestions;

public class AllocateMinBooks {
}





//https://www.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1

//class Solution {
//    public int findPages(int[] arr, int k) {
//        if(arr.length < k){
//            return -1;
//        }
//        int result = -1;
//        int start = max(arr);
//        int end  = sum(arr);
//        while(start<=end){
//            int mid = start + (end - start)/2;
//            if(countStudents(arr,mid)>k){
//                start = mid+1;
//            }else{
//                result = mid;
//                end = mid -1;
//            }
//        }
//        return result;
//    }
//    //number of student can hold this maximum number of pages ofbooks
//    int countStudents(int[] arr, int maxPages){
//        int totalPages = 0;
//        int studentCount=1;
//        for(int i=0; i<arr.length; i++){
//            if(totalPages + arr[i] <= maxPages){
//                totalPages += arr[i];
//            }else{
//                studentCount++;
//                totalPages = arr[i];
//            }
//        }
//        return studentCount;
//    }
//
//    //function to find maximum of array
//    int max(int[] arr){
//        int max = arr[0];
//        for(int a:arr){
//            if(a>max){
//                max = a;
//            }
//        }
//        return max;
//    }
//
//    //function to find the sum of the array
//    int sum(int[] arr){
//        int sum = 0;
//        for(int a:arr){
//            sum+=a;
//        }
//        return sum;
//    }
//}