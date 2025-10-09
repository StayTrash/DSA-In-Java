class Solution {
    public boolean isHappy(int n) {
        int slow = sqSum(n);
        int fast = sqSum(sqSum(n));

        if (slow == fast) {
            return true;
        }
        while (slow != fast) {
            slow = sqSum(slow);
            fast = sqSum(sqSum(fast));

            if (slow == 1) {
                return true;
            }
        }

        return false;
    }

    private int sqSum(int num) {
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            sum += rem * rem;
            num /= 10;
        }

        return sum;
    }
}