import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int ans = 0;

        while (true) {
            // Take Operator as input

            System.out.print("Enter the operator : ");
            char op = input.next().trim().charAt(0);


        if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
            // Input two numbers

            System.out.print("Enter two numbers : ");
            int num1 = input.nextInt();
            int num2 = input.nextInt();

            if (op == '+') {
                ans = num1 + num2;
            }
            if (op == '-') {
                ans = num1 - num2;
            }
            if (op == '*') {
                ans = num1 * num2;
            }
            if (op == '/') {
                if (num2 != 0) {
                    ans = num1 / num2;
                }
            }
            if (op == '%') {
                ans = num1 % num2;
            }
        } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid Operation");
            }
            System.out.println(ans);

        }
    }
}
