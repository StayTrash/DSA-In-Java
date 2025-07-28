import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr1 = {5, 4, 3, 2, 1};
        int[] arr2 = {1, 2, 3, 4, 5};

        BubbleSort(arr1);
        BubbleSort(arr2);   // check for debugging
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
    static void BubbleSort(int[] arr) {
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step , max items will come at last respective index
            for (int j = 1; j <= arr.length - i - 1; j++) {   // or (j < arr.length - 1)
                // swap if the items is smaller than the previous items
                if (arr[j] < arr[j-1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted , hence stop the program
            if (!swapped) {  // or (swapped == false)  // !false == true
                break;
            }
        }
    }
}