public class ClassObject {
    public static void main(String[] args) {

        // just declaring
//        Student kunal;
//        kunal = new Student();

//        Student kunal = new Student();

//        System.out.println(kunal);
//        System.out.println(kunal.rno);
//        System.out.println(kunal.name);
//        System.out.println(kunal.marks);

//        kunal.rno = 7;
//        kunal.name = "Kushwaha";
//        kunal.marks = 90.78f;

//        System.out.println(kunal);
//        System.out.println(kunal.rno);
//        System.out.println(kunal.name);
//        System.out.println(kunal.marks);



//        Student rahul = new Student();
//
//        System.out.println(rahul.rno);
//        System.out.println(rahul.name);
//        System.out.println(rahul.marks);

//        kunal.greetings();
//        kunal.changeName("Anime");
//        kunal.greetings();

        // contructor overloadind
//        Student hello = new Student();
//        Student hello = new Student(10, "Hello World", 89.76f);
//        System.out.println(hello.rno);
//        System.out.println(hello.name);
//        System.out.println(hello.marks);

//        Student kunal = new Student();
//        Student random = new Student(kunal);
//        System.out.println(random.name);

//        Student random2 = new Student();
//        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name = "Something Somethng";
        System.out.println(two.name);
    }

}

// create a class
// for every single student

class Student {
    int rno;
    String name;
//    float marks;
    float marks = 95;

//    Student () {   // constructor function --> does not need any return type
//        kunal.rno = 7;
//        kunal.name = "Kushwaha";
//        kunal.marks = 90.33;
//    }

    void greetings () {
        System.out.println("Hello! my name is " + name);
        System.out.println("Hello! my name is " + this.name);
    }

    void changeName (String newName) {
        name = newName;
    }

    // we need a way to add the values of the above
    // object by object
    // we need one word to access every object

    // use --> "this" keyword
//    Student () {
//        this.rno = 7;
//        this.name = "Kushwaha";
//        this.marks = 90.33f;
//    }

//    Student (int rno, String name, float marks) {
//
////        rno = rno;
////        name = name;
////        marks = marks;
    // won't work  --> gets confused
    // use this.
//
//
//        this.rno = rno;
//        this.name = name;
//        this.marks = marks;
//    }

    Student () {
        // this is how you call a constructor form another constructor
        // internally : new Student(13, "Arpit", 89.99f);
        this (13, "Arpit", 89.99f);
    }

//    Student arpit = new Student(70, "Arpit", 87.23f);
//    here , "this" will be replaced with "arpit"

    Student (int roll, String naam, float marksss) {
//        this.rno = roll;
//        this.name = naam;
//        this.marks = marksss;

        rno = roll;
        name = naam;
        marks = marksss;
    }
//    Student (Student other) {
//        this.rno = other.rno;
//        this.name = other.name;
//        this.marks = other.marks;
//    }
}