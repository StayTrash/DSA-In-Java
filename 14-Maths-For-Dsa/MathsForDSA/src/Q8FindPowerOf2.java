public class Q8FindPowerOf2 {
    public static void main(String[] args) {
        int n = 128;   // note fix for n = 0 if n = 0 false

//        boolean ans = n & (n - 1) == 0;    // error
        // " == " precedence higher than " & "
        boolean ans = (n & (n - 1)) == 0;    // " == " precedence higher than " & "
        System.out.println(ans);
    }
}
