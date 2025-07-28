public class DuplicateRBS9 {
    public static void main(String[] args) {
//        int[] arr = {2, 9, 2, 2, 2};
        int[] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};

        System.out.println(findPivotWithDuplicates(arr));
        System.out.println(SearchTarget(arr, 2));
    }

    static int findPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        if (start == end) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // 4 Cases to find Pivot
            if ((mid < end) && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if ((mid > start) && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }

//            if (arr[mid] <= arr[start]){
//                end = mid - 1;
//            } else {              // (arr[start] < arr[mid])
//                start = mid + 1;


            // if elements at middle , start, end are equal then just skips the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]){

                // skip the duplicates
                // NOTE : what if these elements at start and end were the pivot ??
                // Check if start is pivot

                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot or not

                if (arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            }

            // left side is sorted, so pivot should be in right

            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int SearchTarget(int[] arr, int target) {
        int pivot = findPivotWithDuplicates(arr);

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
