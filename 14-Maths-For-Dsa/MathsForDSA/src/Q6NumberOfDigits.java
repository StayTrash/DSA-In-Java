public class Q6NumberOfDigits {
    public static void main(String[] args) {
//        for base 10 : decimal
//        int n = 34567;
//        int b = 10;

//        for base 2 : binary
        int n = 11;
        int b = 2;

        int ans = (int)(Math.log(n) / Math.log(b)) + 1;

        System.out.println(ans);
    }
}
