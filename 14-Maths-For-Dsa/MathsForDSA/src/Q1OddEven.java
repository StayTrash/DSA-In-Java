public class Q1OddEven {
    public static void main(String[] args) {
        int n = 68;
        System.out.println(issOdd(n));
    }
    static boolean issOdd(int n) {
        return (n & 1) == 1;
    }
}