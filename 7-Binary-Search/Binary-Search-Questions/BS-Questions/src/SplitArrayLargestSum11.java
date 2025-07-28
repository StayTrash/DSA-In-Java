// https://leetcode.com/problems/split-array-largest-sum/

public class SplitArrayLargestSum11 {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int m = 2;

        System.out.println(splitArray(nums, m));
    }

//    Q: Split Array Largest Sum

    static int splitArray (int[] nums, int m) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); // in the end of the loop, this will contain the max element from the array
            end += nums[i];
        }

        // Binary Search
        while (start < end) {
            // try for the middle as potential answer
            int mid = start + (end - start) / 2;

            // calculate how many pieces you can divide this in with this max Sum
            int sum = 0;
            int pieces = 1;

            for (int num : nums) {
                if (sum + num > mid) {
                    // you cannot add this in this subarray, make new one
                    // say you add this num in new subarray, then sum = num

                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return end;  // here start == end
    }
}
