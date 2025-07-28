public class Shadowing {
   static int x = 90;  // This will be shadowed at line 8

    public static void main(String[] args) {

        System.out.println(x);  // 90
        int x;    // Class variable at line 4 is shadowed by this
//        System.out.println(x);   // Scope will begin when value is initialised here only declared
        x = 40;                    // here it gets initialised  & x=90 gets shadowed
        System.out.println(x);  // 40
        fun();       // 90
    }

    static void fun(){
        System.out.println(x);
    }
}
