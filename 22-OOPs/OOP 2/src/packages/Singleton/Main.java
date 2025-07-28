package packages.Singleton;

public class Main {
    public static void main(String[] args) {
//        Singleton obj = new Singleton();
        // could access because private

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        // all these 3 ref variables are pointing to same object
    }

}
