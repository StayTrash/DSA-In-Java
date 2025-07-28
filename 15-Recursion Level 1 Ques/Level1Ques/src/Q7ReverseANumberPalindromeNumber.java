public class Q7ReverseANumberPalindromeNumber {
    public static void main(String[] args) {
//        System.out.println(reverse1(2783));
//        int digits = (int)(Math.log10(1234) + 1);
//        System.out.println(digits);
        System.out.println(reverse2(2783));
        System.out.println(palindrome(1221));
    }
    static int sum = 0;
    static int reverse1(int n) {
        if (n == 0) {
            return sum;
        }
        int rem = n % 10;
        sum = (sum * 10) + rem;
        return reverse1(n / 10);
    }
    // sometimes you might need additional variables in the argument
    // in that case , make another function --> "Helper Function"
    static int reverse2(int n) {
        int digits = (int)(Math.log10(n) + 1);   // will give total number of digits
        return helper(n, digits);
    }
    static int helper(int n, int digits) {
        if (n % 10 == n) {   // or (n == 0) return 1
            return n;
        }
        int rem = n % 10;
        return rem * (int)Math.pow(10, digits-1) + helper(n/10, digits-1);
    }
    static boolean palindrome(int n) {
        return  n == reverse1(n);
    }
}
