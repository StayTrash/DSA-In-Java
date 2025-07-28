public class IfElse {
    public static void main(String[] args) {
        /*

        Syntax of if statements
                if (Boolean expression T or F){
                    // Body
        } else{
                    // Do This
        }

      */
        int salary = 35400;

//        if(salary > 10000){
//            salary = salary + 2000;
//        } else {
//            salary = salary + 1000;
//        }

        // Multiple if-else

        if (salary > 20000){
            salary += 3000;           // salary = salary + 3000
        }else if (salary > 10000){
            salary += 2000;
        } else {
            salary += 1000;
        }

        System.out.println(salary);
    }
}