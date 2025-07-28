public class Find_Minimum {
    public static void main(String[] args) {
        int[] nums = {2, 34, 56, -12, 78, 9, 533, -54, 78, 99};
        System.out.println(min(nums));

    }

    //  assume arr.lenght != 0
    // return the minimum value in the array
    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
