//https://leetcode.com/problems/missing-number/description/

public class Q1MissingNumber {
    public static void main(String[] args) {
        int[] nums1 = {4, 0, 1, 2}; // case1
        int[] nums2 = {3,0,1,2};

        System.out.println(missingNumber(nums1));
        System.out.println(missingNumber(nums2));

    }
    static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        // search for missing number : case1
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
//        case 2: if there is no number of the length of the array
        return arr.length;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
