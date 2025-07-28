public class RotationCountInRotatedSortedArray10 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};

        System.out.println(countRotations(arr));

    }

//    Q: Rotation count in Rotated Sorted Array

    static int countRotations (int[] arr) {
        int pivot = findPivot(arr);

//        if (pivot == -1) {
//            // array is not rotated
//            return 0;
//        }

        return pivot + 1;    // ---> -1 + 1 = 0  if (pivot == -1)
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // 4 Cases to find Pivot
            if ((mid < end) && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if ((mid > start) && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if (arr[mid] <= arr[start]){
                end = mid - 1;
            } else {              // (arr[start] < arr[mid])
                start = mid + 1;
            }
        }
        return -1;
    }

    // use this when array contains Duplicates

    static int findPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length - 1;

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
}

