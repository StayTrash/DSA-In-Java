public class Ceiling1 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;

        int ans = CeilingBs(arr, target);
        System.out.println(ans);
    }

    // Ceiling : smallest number just greater than equal to target
    static int CeilingBs(int[] arr, int target){
        // but what if the target is greater than the greatest number in the array
//        if (target > arr[arr.length]){
//            return -1;
//        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            // find the middle element
            // int mid = (start + end) / 2 ; // might be possible that (start + end) exceeds the range of integer in java

            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            }else{
                // ans found
                return mid;
            }
        }

        // this line will execute if none of the statement above have executed
        // hence the target not found
        return start;
    }

//    static int CeilingBs(int[] arr, int target){
//        int start = 0;
//        int end = arr.length - 1;
//
//
//        while (start <= end){
//            int mid = start + (end - start)/2;
//
//            if(arr[mid] == target){
//                return mid;
//            } if (target <= arr[mid]){
//                end = mid - 1;
//            } else if (target >= arr[mid]){
//                start = mid + 1;
//            }
//        }
//        return start;
//    }
}
