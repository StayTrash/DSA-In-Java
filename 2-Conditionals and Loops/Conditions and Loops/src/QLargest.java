import java.util.Scanner;

public class QLargest {
    public static void main(String[] args) {

//        Q: Find the largest of the three numbers

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

//        int max = a;
//
//       if (b > max){
//           max = b;         // dont write b = max
//       } if (c > max) {     // you can also use else if
//           max = c;         // dont write c = max
//       }
//        System.out.println(max);

//      --->  // OR

//        int max = 0;           // can also use only  " int max ; "
//        if (a > b) {
//            max = a;
//        } else {              // can also use " else if or if "
//            max = b;
//        } if (c > max) {
//            max = c;
//        }
//        System.out.println(max);

//        ---> OR

        int max = Math.max(c, Math.max(a , b));
        System.out.println(max);


    }
}
