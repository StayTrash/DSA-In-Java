public class Q6ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(prod(8754));
    }
    static int prod(int n) {
//        if (n % 10 == n) {
//            return n;
//        }

//        OR

        if (n == 0) {
            return 1;
        }
        return n % 10 * prod(n / 10);
    }
}
