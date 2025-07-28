public class Linear_Search {
    public static void main(String[] args) {
        int[] nums = {2, 34, 56, -12, 78, 9, 533, -54, 78, 99};
        int target = 533;
        int ans = linearSearch(nums, target);
        int ans2 = linearSearch2(nums, target);
        boolean ans3 = linearSearch3(nums, target);

        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);
    }

    // search in the array : return the index if the item found
    // otherwise if the item not found : return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
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

    // search the target and return the element
    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int element : arr) {    // enhanced for loop
//            check for element at every index if it = target
            if (element == target) {
                return element;
            }
        }
        // this line will execute if none of the statement above have executed
        // hence the target not found
        return Integer.MAX_VALUE;
    }

    // search the target and return true or false
    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        for (int element : arr) {    // enhanced for loop
//            check for element at every index if it = target
            if (element == target) {
                return true;
            }
        }
        // this line will execute if none of the statement above have executed
        // hence the target not found
        return false;
    }
}
