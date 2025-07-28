public class Concept {
    public static void main(String[] args) {
        concept(5);
    }
    static void concept(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        // n-- vs --n

//        concept(n--);  // it will pass n first then decrement --> making it infinity loop
        concept(--n);  // it will decrement first then pass n
    }
}
