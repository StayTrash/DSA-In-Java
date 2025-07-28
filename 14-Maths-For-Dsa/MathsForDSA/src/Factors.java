import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        factors(20);
        System.out.println();

        factors2(20);
        System.out.println();

        factors3(20);
    }
    static void factors(int n) {   // Time Complexity : O(N)
        for (int i = 1; i <= n ; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
    static void factors2(int n) {  // Optimised,  Time Complexity : O(sqrt(N))
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " " + n / i + " ");
                }
            }
        }
    }
    // above code will not give ans in sorted order
    static void factors3(int n) {  // Optimised,  Time Complexity : O(sqrt(N))
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    list.add(n / i);
                }
            }
        }
        for (int i = list.size() - 1;  i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
