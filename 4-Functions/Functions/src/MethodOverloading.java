public class MethodOverloading {
    public static void main(String[] args) {

        fun("Shubham");
        fun(45);
        int ans1 = sum(3, 5);
        System.out.println(ans1);

        int ans2 = sum(3,4, 1);
        System.out.println(ans2);
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }

    static int sum(int a, int b){
        return a + b;
    }

    static int sum(int a, int b, int c){
        return a + b + c;
    }
}
