public class Q5RightMostSetBit {
    public static void main(String[] args) {
        int n = 732;
        System.out.println(find(n));
    }

    static int find(int n) {
        return n & (-n);
    }
}
