public class Search_In_Range {
    public static void main(String[] args) {
        int[] nums = {2, 34, 56, -12, 78, 9, 533, -54, 78, 99};
        int target = 56;

        System.out.println(SearchInRange(nums, target, 1,4));
    }

    // search in the array : return the index if the item found
    // otherwise if the item not found : return -1
    static int SearchInRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = start; index < end; index++) {
//            check for element at every index if it = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // this line will execute if none of the statement above have executed
        // hence the target not found
        return -1;
    }
}
