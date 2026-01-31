public class pract {
    public static void main(String[] args) {
        Car car = new Car(180);
//        car.maxSpeed = 199;

        // We can read it, but we cannot change it
        System.out.println("The car's max speed is: " + car.maxSpeed);
    }
}

class Car {
    final int maxSpeed;

    Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}