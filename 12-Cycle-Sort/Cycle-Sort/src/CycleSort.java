import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] nums1 = {3, 5, 2, 1, 4};
        int[] nums2 = {5, 4, 3, 2, 1};

        cycleSort(nums1);
        cycleSort(nums2);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
    }
    static void cycleSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}