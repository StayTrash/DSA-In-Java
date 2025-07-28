import java.util.Arrays;

public class VarArgs {   // variable arguments
    public static void main(String[] args) {
        fun(2,3,4,56,67,3434,67674,2342,4,56,78);

        multiple(3, 45, "Shubham","Kunal","Harry", "89");
    }

    static void fun(int ...v){    // ... when you dont know the numbers of elements
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a, int b, String ...v){
        System.out.println(a + " " + b + " " + Arrays.toString(v));
    }
}
