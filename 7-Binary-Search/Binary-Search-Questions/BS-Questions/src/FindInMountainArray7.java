// https://leetcode.com/problems/find-in-mountain-array/c

public class FindInMountainArray7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};

        int ans = search(arr , 5);
        System.out.println(ans);
    }

//    Q: Find in Mountain Array

    static  int search (int[] arr, int target) {
        int peak = PeakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr , target, 0, peak);

        if (firstTry != -1) {
            return firstTry;
        }

        // try to search in second half
        return orderAgnosticBS(arr, target, peak+1, arr.length - 1);
    }

    static int PeakIndexInMountainArray (int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]){
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return  start; // or return end as in the end , both are equal
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end){
//        int start = 0;
//        int end = arr.length - 1;

        // find whether the array is sorted in Ascending or Descending

//        boolean isAsc;
//        if(arr[start] < arr[end]){
//            isAsc = true;
//        } else {
//            isAsc = false;
//        }
        // OR

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            // find the middle element
            // int mid = (start + end) / 2 ; // might be possible that (start + end) exceeds the range of integer in java

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else{
                if (target > arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
