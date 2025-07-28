public class Even_Digits {
    public static void main(String[] args) {
        int[] nums = {12,3456,2,6,7869};
        System.out.println(findNumbers(nums));

        System.out.println(digits(7878));
        System.out.println(digits(0));
        System.out.println(digits(-97897574));

        System.out.println(digits2(232));
        System.out.println(digits2(-12343));

    }

    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    // function to check whether a number contains even digits or not
    static boolean even(int num){
        int numberOfDigits = digits(num);

//        if(numberOfDigits %2 == 0){
//            return true;
//        }
//        return false;

//        "OR"
        return numberOfDigits %2 == 0;
    }

    // count the number of digits in a number
    static int digits(int num){
        int count = 0;

        if(num < 0) {
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }
        while(num > 0){
            count++;
            num /= 10;
        }
        return count;
    }

    // another way to count no. of  digits in a number
    static int digits2(int num){
        if(num < 0) {
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }
}
