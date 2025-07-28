public class Floor2 {
        public static void main(String[] args) {
            int[] arr = {2,3,5,9,14,16,18};
            int target = 15;
//            int target = -9;

            int ans = FloorBS(arr, target);
            System.out.println(ans);
        }

        // Floor : biggest number just smaller than or equal to target
        static int FloorBS(int[] arr, int target){
            // but what if the target is smaller than the smallest number in the array
            if (target < arr[0]){
                return -1;

//             not written will also return -1 ---> use debugging or DRY RUN
//                but better to use this condition
            }

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
            return end;
        }
    }

