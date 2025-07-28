import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        /*
            --->  Syntax of for loops

           for (initialisation; condition; increment/decrement) {
               // Body
            }

         */

        // Q: Print numbers from 1 to 5

//        for (int num = 1; num <= 5; num += 1){
//            System.out.println(num);
//        }
//
        // Q: Print numbers from 1 to n

//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//
//        for (int num = 1; num <= n; num++) {
////            System.out.print(num + " ");
//            System.out.println("Hello World");
//        }

      //    --->    While Loops

        /*
              Syntax for " While Loops "

              while (condition) {
              // Body
              }

         */

//        int num = 1;
//
//        while (num <= 5) {
//            System.out.println(num);
//            num += 1;
//        }

//    Use " WHILE LOOPS " when you dont know how many times the loop is going to run
//    Use " FOR LOOPS " when you know how many times the loop is going to run


//        ---> Do WHILE LOOPS
//        Syntax for " do while loops "
        /*
                do {

                } while ();

        */

//        int n = 1 ;
//        do {
//            System.out.println(n);
//            n++;
//        } while (n <= 5);
//
//      ***** --->  in " do while loop " the program is going to run at least one time

        int n = 1;
        do {
            System.out.println("Hello World");
        } while (n != 1);

    }
}
