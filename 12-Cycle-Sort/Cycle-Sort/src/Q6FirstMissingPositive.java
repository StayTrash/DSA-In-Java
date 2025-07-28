//https://leetcode.com/problems/first-missing-positive/description/

public class Q6FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};

        System.out.println(firstMissingPositive(nums));
    }
    static int firstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if(arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        // search for missing number : case1
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }
//        case 2: if there is no number of the length of the array
        return arr.length + 1;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
