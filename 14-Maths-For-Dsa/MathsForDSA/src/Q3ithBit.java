public class Q3ithBit {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(findBit(n , 4));
    }
    static int findBit(int n, int i) {
        return (n & (1 << (i - 1))) >> (i - 1);
    }
}
