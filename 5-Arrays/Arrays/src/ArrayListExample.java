import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(23);
//        list.add(34);
//        list.add(234);
//        list.add(23342);
//        list.add(523);
//        list.add(256673);
//        list.add(23);
//        list.add(243);
//        list.add(22233);
//        list.add(2);
//        list.add(3);
//        list.add(133423);
//        list.add(23534);
//        list.add(23878);
//        list.add(2789678);

//        System.out.println(list);

        // to check whether element is present in Array or not
//        System.out.println(list.contains(23));      // true
//        System.out.println(list.contains(1212));   // false

        // Modify
//        list.set(0, 99);
//        System.out.println(list);
//
//        list.remove(2);
//        System.out.println(list);
        
        // input

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
           // get an item from any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));  // pass index here, list[index] will not work here
        }
        System.out.println(list);
    }
}
