package InheritanceProperties;

public class BoxWeight extends  Box{
    double weight;

     public BoxWeight() {
         this.weight = -1;
     }

     BoxWeight (BoxWeight other) {
         super(other);
         weight = other.weight;
     }  // "or" Box box5 = new BoxWeight(2,3,4,7);  ---> same thing

    public BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h);   // call the parent class constructor
        // used to initialise the values in parent class
        // here it is initialising when l is private
        // because box class is initialising it, not BoxWeight class
        this.weight = weight;

//        super(l, w, h);  // will give error here, sabse pehle isko initialise kro

//        System.out.println(super.weight);  // use weight from Box class not BoxWeight class
    }

    BoxWeight (double side, double weight) {
         super(side);
         this.weight = weight;
    }

//    @Override
    static void greeting() {
        System.out.println("Hey, I am in BoxWeight class. Greetings!");
    }
}
