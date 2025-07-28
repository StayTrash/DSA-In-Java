public class Q1SortedArray {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,8,9};
        System.out.println(sorted(num, 0));
    }
    static boolean sorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }
}