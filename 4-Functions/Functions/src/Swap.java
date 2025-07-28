import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Swap Two Numbers

//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println(a + " " + b);

        swap(a , b);
        System.out.println(a + " " + b);

        String name = "Shubham Gupta";
        changeName(name);
        System.out.println(name);

        int[] nums = {1,2,3,4,5};
        swap1(nums, 0, 1);
        System.out.println(Arrays.toString(nums));
    }

     static void changeName(String naam) {
        naam = "Kunal Kushwaha";      // creating a new object
    }

    static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }

    static void swap1(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
