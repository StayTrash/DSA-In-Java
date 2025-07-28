public class Q4SetResetBit {
    public static void main(String[] args) {
        int n = 9;

        System.out.println(set(n, 2));
        System.out.println(reset(n, 4));
    }
    static int set(int n, int i) {
        return n | (1 << (i - 1));
    }
    static int reset(int n ,int i) {
        return n & (~ (1 << (i - 1)));
    }
}
