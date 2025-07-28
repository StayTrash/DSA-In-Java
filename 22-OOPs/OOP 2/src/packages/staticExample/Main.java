package packages.staticExample;

public class Main {
    public static void main(String[] args) {
//        Human kunal = new Human(22, "Kunal Kushwaha", 10000, false);
//        Human rahul = new Human(32, "Rahul Kushwaha", 15000, true);
//
//        System.out.println(kunal.name);
//
//        System.out.println(kunal.population);
////        System.out.println(rahul.population);
//
//        // correct convention to check for static variable
//        System.out.println(Human.population);
//
        fun();

        Main funnn = new Main();
        funnn.fun2();
    }

    static void fun () { // this is not dependent on object
//        greeting();   // you cannot use this because it requires an instance
//        // but the function you are using it in does not depend on instance
//        Main.greeting();  // this way aslo cannot access --> error

        // you cannot access non-static stuff without referencing their instance in
        // a static context

        // here referencing it
        // because non-static method under static method needs an object to run
        // so here referencing it
        Main obj = new Main();
        obj.greeting();   // this way can access by referencing it to an object
    }

    void fun2() {
        greeting();  // works here
        // because it will be called directly or indirectly in "main"
        // why --> everything starts from "main"
    }
    void greeting() {  // something which is not static --> depends/belong to an object
        System.out.println("Hello World");
        fun();   // though not static method can access static method
    }
}
