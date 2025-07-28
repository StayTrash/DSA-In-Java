public class NumberExample {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n) {
        // base conditon
        if (n == 5) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        // recursive call
        // if you are calling a function again & again ,you can treat it as a separate call in the stack
        print(n + 1);  // recursive call
    }
    static void fab(int n) {
        if (n < 2) {
            System.out.println(n);
        }
    }
}