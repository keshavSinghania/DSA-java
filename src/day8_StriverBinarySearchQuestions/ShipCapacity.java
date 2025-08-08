//package day8_StriverBinarySearchQuestions;
//
//public class ShipCapacity {
//}

//Capacity To Ship Packages Within D Days
//https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/

class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start = findMax(weights);
        int end = findSum(weights);
        int ans = -1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(isPossibleWeight(weights,mid,days)){
                ans = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }
    /*
    function to check wheather is it possible to load all the items
    with in given day with passed minimum weight
    */
    boolean isPossibleWeight(int[]arr, int minWeight, int days){
        int loadedWeight = 0;
        int currentDay = 1;
        for(int i=0; i<arr.length; i++){
            if(loadedWeight + arr[i] <= minWeight){
                loadedWeight+=arr[i];
            }else{
                currentDay ++;
                loadedWeight = arr[i];
            }
        }
        return currentDay<=days;
    }

    //function to find the maximum value of array
    int findMax(int[] arr){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    //function to find the sum of all the elements of array
    int findSum(int[] arr){
        int sum = 0;
        for (int num : arr) sum += num;
        return sum;
    }

}