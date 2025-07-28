import java.util.Scanner;

public class NestedSwitchCases {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empID = input.nextInt();

//        switch (empID) {
//            case 1:
//                System.out.println("Shubham Gupta");
//                break;
//            case 2:
//                System.out.println("Kunal Kushwaha");
//                break;
//            case 3:
//                System.out.println("Empl Number 3");
//                String department = input.next();
//                switch (department) {
//                    case "IT":
//                        System.out.println("IT Department");
//                        break;
//                    case "Management":
//                        System.out.println("Management Department");
//                        break;
//                    default:
//                        System.out.println("NO department entered");
//                }
//                break;
//            default:
//                System.out.println("Enter correct EmpID");
//                break;
//        }


//        --->     Enhanced "Switch Statements"


        switch (empID) {
            case 1 -> System.out.println("Shubham Gupta");
            case 2 -> System.out.println("Kunal Kushwaha");
            case 3 -> {
                System.out.println("Empl Number 3");
                String department = input.next();
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("NO department entered");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }
    }
}
