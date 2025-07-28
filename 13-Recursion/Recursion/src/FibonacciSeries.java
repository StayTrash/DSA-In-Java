public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println(fibo(6));

        System.out.println(fiboFormula(50));
        for (int i = 0; i < 11; i++) {
            System.out.println(fiboFormula(i));
//            System.out.println(fs(i));
        }
    }
    static int fibo(int n){
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);  // recurrence relation
        // (makes recurrence tree)
    }
    static int fiboFormula(int n){
        return (int)Math.pow((1 + Math.sqrt(5)) / 2, n);
    }

    static int fs(int n) {
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;

        if (n<2) {
            return n;
        }
        for (int i = 2; i <= n ; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }
}
