public class Scope {
    public static void main(String[] args) {
    int a = 10;  // --> initialising
    int b = 20;
    String name = "Shubham";

//    " Block Scope "

        {
//   updating -->         int a = 78; // already initialised outside the block in the same method hence you cannot initialised again
            a = 100;  // reassign the original ref variable to some other value
            System.out.println(a);
            int c = 99;
            // values initialised in this block, will remain in this block
            name = "Kunal";
            System.out.println(name);

            // Scoping in for loops
            for (int i = 0; i < 4; i++) {
                System.out.println(i);
                a = 1000;

            }
        }

//        System.out.println(c);  // cannot use outside the block

//        System.out.println(marks);
        System.out.println(a);
        System.out.println(name);
        random(70);
    }


    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
