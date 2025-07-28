import java.util.Arrays;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class FirstAndLastPositon4 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 7;

        int[] ans = searchRange(nums,target);
        System.out.println(Arrays.toString(ans));
    }

    // Q : Find the First and Last position of an element in a Sorted Array
    //     if target not found, return {-1,-1}

    static int[] searchRange(int[] nums, int target){

        int[] ans = {-1,-1};

        // check for first occurrence if target is first

//        int start = search(nums, target, true);
//        int end = search(nums, target, false);
//
//        ans[0] = start;
//        ans[1] = end;

        // OR

        ans[0] = search(nums, target, true);
        if (ans[0] != -1){
            ans[1] = search(nums, target, false);
        }

        return ans;

    }

    // this function just returns the index value of target
     static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;

        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target < nums[mid]){
                end = mid - 1;
            } else if (target > nums[mid]){
                start = mid + 1;
            }else{
                // potential ans found
                ans = mid;
                if (findStartIndex){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
