package day6_BInarySearchpart2;

public class NoOfRepeatedValueInSortedArray {
    public static void main(String[] args) {
        int [] arr = {1,3,3,7,9,12,14,14,14,14,14,17,20};//sorted
        int key1 = 14; //ans = 5;
        int key2 = 3; //ans = 2;
        int key4 = 9; //ans = 1;
        int key = 18;// ans = 0;

        int lowestIndex = ans(arr,key,true);
        int highestIndex = ans(arr,key,false);
        int length ;
        if (lowestIndex == -1 || highestIndex == -1) {
            length = 0;
        } else {
            length = (highestIndex - lowestIndex) + 1;
        }
        System.out.println(length);

    }

    //function to find number repeated value inside sorted array
    static int ans (int []arr , int key, boolean lowest){
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start)/2;
        int index = -1;
        while (start<=end){
            if(arr[mid] == key){
                index = mid;
                if(lowest){ //for finding lowest index which contain our key
                    end = mid-1;
                }
                else{ // to find highest index which contains our key
                    start = mid+1;
                }
            }
            else if(arr[mid]>key){
                end = mid -1;
            }else {
                start = mid +1;
            }
            mid = start + (end - start)/2;
        };
        return index;
    }
}
