import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,5,9,7,8};   // even elements
        int[] arr2 = {1,3,23,9,8};    // odd elements  ---> works for both
        reverse(arr1);
        reverse(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            // Swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    // Reversing an Array by Swap function
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
