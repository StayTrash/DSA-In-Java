package packages.staticExample;

// you cannot make outside class --> "static"
// because it is not itself dependent on any other class

public class InnerClass {
    // you cannot make outside class --> "static"
    // because it is not itself dependent on any other class

    class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
    }
    static class Test3 {  // static here means does not depend on objects of "Innerclass"
            String name;

            public Test3(String name) {
                this.name = name;
            }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
//        Test a = new Test("Kunal");   // error
//        Test b = new Test("Hello");

//        Test2 a = new Test2("Kunal");
//        Test2 b = new Test2("Hello");

        Test3 a = new Test3("Kunal");
        Test3 b = new Test3("Hello");

        System.out.println(a.name);
        System.out.println(b.name);

        System.out.println(a);
    }
}
class Test2 {
    String name;

    public Test2(String name) {
        this.name = name;
    }
}


//static class A {   // not valid   --> error
//
// you cannot make outside class --> "static"
// because it is not itself dependent on any other class

//}
