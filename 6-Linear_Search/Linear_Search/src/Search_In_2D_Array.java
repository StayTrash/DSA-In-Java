import java.util.Arrays;

public class Search_In_2D_Array {
    public static void main(String[] args) {
        int[][] arr = {      // here can also be written int[][] new {} but not necessary
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        int target = 34;
        int[] ans = search(arr,target);  // format of return value {row,col}
        System.out.println(Arrays.toString(ans));

        int maxVal = Max(arr);
        System.out.println(maxVal);

        int maxVal2 = Max2(arr);
        System.out.println(maxVal2);

    }
    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    // for Maximum Value
    static int Max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }

    // using for each loop
    static int Max2(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}

