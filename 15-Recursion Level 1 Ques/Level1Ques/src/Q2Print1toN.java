public class Q2Print1toN {
    public static void main(String[] args) {
//        printNto1(5);
        print1toN(5);
        System.out.println();
        printBoth(5);
    }
    static void printNto1(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNto1((n - 1));
    }
//    static void print(int n) {
//        if (n == 5) {
//            return;
//        }
//        System.out.print(n + " ");
//        print(n+1);
//    }
    static void print1toN(int n) {
        if (n == 0) {
            return;
        }
        print1toN(n - 1);
        System.out.print(n + " ");
    }

    static void printBoth(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printBoth(n - 1);
        System.out.print(n + " ");
    }
}
