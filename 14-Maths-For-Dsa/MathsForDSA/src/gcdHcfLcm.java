public class gcdHcfLcm {
    public static void main(String[] args) {
        System.out.println(gcd(6, 12));
        System.out.println(lcm(2, 7));
    }
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    static int lcm(int a, int b) {
     return (a * b) / gcd(a, b);
    }
}
