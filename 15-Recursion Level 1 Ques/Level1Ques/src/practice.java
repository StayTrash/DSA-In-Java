public class practice {
    public static void main(String[] args) {
//        printNto1(5);
//        System.out.println();
//        print1toN(5);
//        both(5);
//        System.out.println(factorial(5));
//        System.out.println(sumNto1(10));
//        System.out.println(sumOfDigits(1088095));
//        System.out.println(prodOfDigits(21396));
//        System.out.println(reverse(2785));
//        System.out.println(reverse2(207890));
//        System.out.println(palindrome(1221));
        System.out.println(countZeros(1200987690));
    }

    static void printNto1(int n) {
        if (n == 0) return;

        System.out.print(n + " ");
        printNto1(n - 1);
    }

    static void print1toN(int n) {
        if (n == 0) return;

        print1toN(n - 1);
        System.out.print(n + " ");
    }

    static void both(int n) {
        if (n == 0) return;

        System.out.print(n + " ");
        both(n - 1);
        System.out.print(n + " ");
    }

    static int factorial(int n) {
        if (n <= 1) return 1;

        return n * factorial(n - 1);
    }

    static int sumNto1(int n) {
        if (n == 1) return 1;

        return n + sumNto1(n - 1);
    }

    static int sumOfDigits(int n) {
        if (n == 0) return 0;

        return n % 10 + sumOfDigits(n / 10);
    }

    static int prodOfDigits(int n) {
        if (n % 10 == n) return n;
//        if (n == 0) return 1;

        return  (n % 10) * prodOfDigits(n / 10);
    }

    static int revSum = 0;
    static int reverse(int n) {
        if (n == 0) return revSum;

        revSum = (revSum * 10) + (n % 10);

        return reverse(n / 10);
    }

    static int reverse2(int n) {
        int digits = (int)(Math.log10(n) + 1);

        return helperRev(n, digits - 1);
    }

    static int helperRev(int n, int digit) {
        if (n == n % 10) return n;

        return ((n % 10) * (int)(Math.pow(10, digit))) + helperRev(n / 10, digit - 1);
    }

    static boolean palindrome(int n) {
        return n == reverse2(n);
    }

    static int countZeros(int n) {
        int count = 0;

        return helperCount(n, count);
    }

    static int helperCount(int n, int count) {
        if (n % 10 ==  n) return count;

        if (n % 10 == 0) count++;

        return helperCount(n / 10, count);
    }
}
