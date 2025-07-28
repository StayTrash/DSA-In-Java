public class pract {
    public static void main(String[] args) {
//        nto1(5);
//        System.out.println(fact(5));
//        System.out.println(sumNto1(10));
//        System.out.println(digitSum(4612));
//        System.out.println(digitsProd(5329));
//        System.out.println(reverse1(36279));
//        System.out.println(reverse2(36279));
//        System.out.println(palindrome(1456122211));
//        System.out.println(count0(1090870));
        System.out.println(steps(123));
    }


    static void nto1(int n) {
        if (n == 0) {
//            System.out.println(n);
            return;
        }

        System.out.println(n);
        nto1(n - 1);
        System.out.println(n);
    }
    static int fact(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * fact(n - 1);
    }

    static int sumNto1(int n) {
        if (n == 1) {
            return 1;
        }

        return n + sumNto1(n - 1);
    }

    static int digitSum(int n) {
        if (n == 0) {
            return 0;
        }

        return n % 10 + digitSum(n / 10);
    }

    static int digitsProd(int n) {
        if (n == 0) {
            return 1;
        }

        return (n % 10) * digitsProd(n / 10);
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
    static int reverse2(int n) {
        int digits = (int) Math.log10(n) + 1;

        return helperReverse(n, digits);
    }
    static int helperReverse(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) Math.pow(10, digits - 1) + helperReverse(n / 10, digits - 1);
    }

    static boolean palindrome(int n) {
        return n == reverse2(n);
    }

    static int count0(int n) {
        return helperCount(n, 0);
    }

    static int helperCount(int n, int c) {
        if (n == 0) {
            return c;
        }

        int rem = n % 10;
        if (rem == 0) {
            return helperCount(n / 10, c + 1);
        }

        return helperCount(n / 10, c);
    }

    static int steps(int n) {
        return helperSteps(n, 0);
    }
    static int helperSteps(int n, int s) {
        if (n == 0) {
            return s;
        }

        if (n % 2 == 0) {
            return  helperSteps(n / 2, s + 1);
        }

        return helperSteps(n - 1, s + 1);
    }
}
