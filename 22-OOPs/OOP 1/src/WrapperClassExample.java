public class WrapperClassExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Integer --> Object not primitve data type
        Integer num1 = 45;
        Integer num2 = 55;

        swap(a, b);    // do not swaps
        // In java, primitives are passed by value not by reference
        System.out.println(a + " " + b);

        swap2(num1, num2);  // do not swaps
//        here Intger gets passed by reference still not swaps
//        because of final calss --> Integer
        System.out.println(num1 + " " + num2);

//        final int bonus = 2;
//        bonus = 5;   // you modify final --> giving error
        // always intialise while declaring it
        // because you cannot modify it later

        final A kunal = new A("Kunal Kushwaha");
        System.out.println(kunal.name);
        kunal.name = "other name";

        // when a non primitive is final, you cannot resign it
        // you can change the value but cannot resign it

//        kunal = new A("new object");   // giving error
        System.out.println(kunal.name);

        A obj;
        for (int i = 0; i < 1000000000; i++) {   // for lesser i --> it will not destroy
            obj = new A("Random Name");
        }
    }
    static void swap (int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
    static void swap2 (Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}
class A {
    final int num = 10;
    String name;

    public A(String name) {
//        System.out.println("Object is created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
