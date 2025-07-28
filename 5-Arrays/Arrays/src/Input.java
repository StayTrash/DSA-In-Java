import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int[] arr = new int[5];
//        arr[0] = 12;
//        arr[1] = 34;
//        arr[2] = 2231;
//        arr[3] = 567;
//        arr[4] = 99;
//        arr[5] = 876;
        // [12,34,2231,567,99]
//        System.out.println(arr[3]);

        // input using for loops

//        for(int i=0; i< arr.length; i++){   // or i<5
//            arr[i] = in.nextInt();
//        }

//        for (int i=0; i< arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }

        // OR    ( for each loop )

//        for (int num : arr) {   // for every element in array, print the element
//            System.out.print(num + " ");  // here num represents elements of array
//        }
//        System.out.println(arr[5]);   // index out of bound

        // OR
//        System.out.println(Arrays.toString(arr));

        // " Array of Objects "

        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        // Modify
        str[2] = "Shubham";
        System.out.println(Arrays.toString(str));
    }
}
