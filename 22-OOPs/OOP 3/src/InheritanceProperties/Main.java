package InheritanceProperties;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box();
//        Box box = new Box(4);
//        Box box = new Box(4.6, 7.9, 9.8);
//
//        Box box2 = new Box(box);
//
//        System.out.println(box.l + " " + box.w + " " + box.h);
//        System.out.println(box2.l + " " + box2.w + " " + box2.h);
//
//        BoxWeight box3 = new BoxWeight();
//        System.out.println(box3.l + " " + box3.weight);
//
//        BoxWeight box4 = new BoxWeight(4,6,7,9);
//        System.out.println(box4.l + " " + box4.weight);
//
//        Box box5 = new BoxWeight(2,3,4,7);
//        System.out.println(box5.l + " " + box5.h + " " + box5.weight);
//        // you can access only those objects which are referencing to super class
//        // cannot access objects from BoxWeight but can access objects form Box


//        BoxWeight box6 = new Box(2,4,5);
        // there are many classes in both parent and child classes
        // you are given access to variables that are in the ref. type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the object itself is of type parent class,
        // how will you call the constructor of child class
        // that is why error

//        BoxPrice box = new BoxPrice(4,5,78,9,90);
//        BoxPrice box1 = new BoxPrice(4,5,7);

//        box1.greeting();


//        Static methods cannot be overriden
//        though it can be inherited

        Box box = new BoxWeight();
        box.greeting();

        BoxWeight box1 = new BoxWeight();
        box1.greeting();


        // data hiding
        box1.getL();

    }
}
