//https://leetcode.com/problems/set-mismatch/description/

import java.util.Arrays;

public class Q5SetMissmatch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};

        System.out.println(Arrays.toString(findError(nums)));
    }
    static int[] findError(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if(arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        // search for missing number : case1
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return new int[]{arr[index], index + 1};
            }
        }
//        case 2: if there is no number of the length of the array
        return new int[]{-1, -1};
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
