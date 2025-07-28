// https://leetcode.com/problems/search-in-rotated-sorted-array/description/

public class RotatedSortedArray8 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
//        int[] arr = {1,1,2};

        System.out.println(findPivot(arr));
        System.out.println(SearchTarget(arr , 6));
    }

    // Q: Search in Rotated Sorted Array ---> Rotated Binary Search (RBS)

    // this will not work for duplicate values
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // 4 Cases to find Pivot
            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if (arr[mid] <= arr[start]){     // <= is for if array have duplicates else only < will work also
                end = mid - 1;
            } else {              // (arr[start] < arr[mid])
                start = mid + 1;
            }
        }
        return -1;
    }
    static int SearchTarget(int[] arr, int target) {
        int pivot = findPivot(arr);

        // if you did not find the pivot, it means the array is not rotated
        if (pivot == -1) {
            // just do normal Binary Search
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        // if pivot is found, you have found 2 Ascending sorted arrays
        if (arr[pivot] == target) {
            return pivot;
        }

        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        }

        return binarySearch(arr, target, pivot + 1, arr.length - 1);    // (target < arr[start])
    }
    static int binarySearch(int[] arr, int target, int start, int end){

        while (start <= end){
            // find the middle element
            // int mid = (start + end) / 2 ;  // might be possible that (start + end) exceeds the range of integer in java

            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            }else{
                // ans found   ---> target == arr[mid]
                return mid;
            }
        }

        // this line will execute if none of the statement above have executed
        // hence the target not found
        return -1;
    }
}
