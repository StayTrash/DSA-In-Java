public class practice {
    public static void main(String[] args) {
        int[] arr = {1, 2, 33, 56, 78, 99};
        int target = 33;
        System.out.println(bs(arr, 0, arr.length - 1, target));
    }

    public static int bs(int[] arr, int s, int e, int target) {
        if (s > e) return -1;

        int m = s + (e - s) / 2;

        if (arr[m] == target) return m;

        if (target > arr[m]) {
            return bs(arr, m + 1, e, target);
        } else {
            return bs(arr, s, m - 1, target);
        }
    }
}
