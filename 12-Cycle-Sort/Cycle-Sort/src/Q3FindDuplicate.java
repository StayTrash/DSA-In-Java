//https://leetcode.com/problems/find-the-duplicate-number/description/

public class Q3FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};

        System.out.println(findDuplicates(nums));
    }
    static int findDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if ( arr[i] != i + 1){
                int correctIndex = arr[i] - 1;
                if (arr[i] != arr[correctIndex]) {
                    swap(arr, i, correctIndex);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
