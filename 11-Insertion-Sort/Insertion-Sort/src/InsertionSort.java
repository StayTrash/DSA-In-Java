import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 88};   // put anything, even empty it will work  {1} , {} try out

        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {  // or (i <= arr.length - 2)
            for (int j = i + 1; j > 0 ; j--) {
                if (arr[j] < arr[j-1]) { // or can make function for swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}