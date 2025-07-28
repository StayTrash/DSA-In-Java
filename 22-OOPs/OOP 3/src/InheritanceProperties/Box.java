package InheritanceProperties;

public class Box {
    double l;
//    private double l;  // after private --> you cannot access in other class
    double w;

    double h;
//    double weight;

    Box () {
        super();   // it belongs to Object Class

        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    // cube
    Box (double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box (double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box (Box old) {
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

    static void greeting() {
        System.out.println("Hey, I am in Box class. Greetings!");
    }

    public void information () {
        System.out.println("Running the box");
    }



    // data hiding
    public double getL() {
        return l;
    }
}