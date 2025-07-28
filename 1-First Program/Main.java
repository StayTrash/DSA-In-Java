import java.text.NumberFormat.Style;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Please enter a number : ");
        int a = input.nextInt();
        

        System.out.print("Please enter another number : ");
        int b = input.nextInt();
        
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}