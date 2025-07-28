public class Main {
    public static void main(String[] args) {
         //                "ARRAYS"
        //       syntax

        // datatype[] variable_name = new datatype[size];

        // Q: store five integers

//        int[] RollNo = new int[5];
//        // OR   directly
//        int [] rollNo = {2,34,56,1,67};

//        int[] RollNo;  // declaration of array, RollNo is getting defined in the stack
//        RollNo = new int[5]; // initialisation: actually here object is being created in the memory (Heap)
//
//        System.out.println(RollNo[1]);  // here internally , by default all elements of array will be " 0 "

        String[] arr = new String[4];
        System.out.println(arr[0]);  // be default , all elements will be "null"
        // "null" means it does not have any datatype

        for(String  elements : arr){
            System.out.println(elements);
        }
    }
}