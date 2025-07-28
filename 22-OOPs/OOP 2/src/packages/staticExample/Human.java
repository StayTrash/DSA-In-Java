package packages.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
//    long population;
    static long population;

    static void message() {
        System.out.println("Hello World");

//        System.out.println(this.age);  // you cannot use this over here
        // because static method does not depend on objects
        // then how can you use something "this" here which is dependent on an object
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
//        population += 1;
//        this.population += 1;
        Human.population += 1;  // --> correct convention

//        this.message();     // --> not
        Human.message();  // --> correct
    }

}
