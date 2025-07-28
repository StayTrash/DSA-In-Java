import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);      // charAt(0) ---> use to convert "string" to "char"
                             // () in charAt() ---> use to print the letter placed of that word given starts from 0,1,2,3....
        // trim() ---> use to remove the space

//        String word = "hello";
//        System.out.println(word.charAt(2));

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }

        System.out.println(ch);




    }
}
