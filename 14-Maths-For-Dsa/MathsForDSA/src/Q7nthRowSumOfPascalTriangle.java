public class Q7nthRowSumOfPascalTriangle {
    public static void main(String[] args) {
        // sum of nth row of Pascals Triangle = 2^(n-1)

        int n = 3;
        int ans = 1 << (n - 1);     // 1 * 2^(n-1)
//        System.out.println(1 << (n - 1));
        System.out.println(ans);
    }
}
