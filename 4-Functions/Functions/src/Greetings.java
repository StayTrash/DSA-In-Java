import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
//        greeting();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        String personalised = myGreet(name);
        System.out.println(personalised);
    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

    static void greeting(){
        System.out.println("Hello World");
    }
}
