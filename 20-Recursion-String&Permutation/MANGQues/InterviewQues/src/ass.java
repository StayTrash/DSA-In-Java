import java.util.Scanner;
import java.lang.Math;
public class ass {


        public static double[] cartesianToCylindrical(double x, double y, double z) {
            double r = Math.sqrt(x*x + y*y);
            double theta = Math.atan2(y, x);
            return new double[] {r, theta, z};
        }

        public static double[] cylindricalToCartesian(double r, double theta, double z) {
            double x = r * Math.cos(theta);
            double y = r * Math.sin(theta);
            return new double[] {x, y, z};
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter Cartesian coordinates (x, y, z): ");
            double xCartesian = scanner.nextDouble();
            double yCartesian = scanner.nextDouble();
            double zCartesian = scanner.nextDouble();

            double[] cylindrical = cartesianToCylindrical(xCartesian, yCartesian, zCartesian);
            System.out.println("\nCartesian to cylindrical:");
            System.out.println("r = " + cylindrical[0]);
            System.out.println("theta = " + cylindrical[1]);
            System.out.println("z = " + cylindrical[2]);

            System.out.println("\nEnter cylindrical coordinates (r, theta, z): ");
            double rCylindrical = scanner.nextDouble();
            double thetaCylindrical = scanner.nextDouble();
            double zCylindrical = scanner.nextDouble();

            double[] cartesian = cylindricalToCartesian(rCylindrical, thetaCylindrical, zCylindrical);
            System.out.println("\nCylindrical to Cartesian:");
            System.out.println("x = " + cartesian[0]);
            System.out.println("y = " + cartesian[1]);
            System.out.println("z = " + cartesian[2]);

            scanner.close();
        }
    }

