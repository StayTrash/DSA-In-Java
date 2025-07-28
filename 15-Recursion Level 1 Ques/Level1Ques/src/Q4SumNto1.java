public class Q4SumNto1 {
    public static void main(String[] args) {
        System.out.println(sumNto1(5));
    }

    static int sumNto1(int n){
        if (n == 1) {
            return 1;
        }
        return n + sumNto1(n - 1);
    }
}
