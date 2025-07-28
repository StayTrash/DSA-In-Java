import java.util.Arrays;

public class Q1RowColSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40,50},
                {15,25,35,45,59},
                {28,29,37,49,76},
                {33,34,38,53,90}
        };

//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };

        System.out.println(Arrays.toString(search(arr, 37)));
    }

//    Q: Search in Row Col Matrix

    static int[] search(int[][] matrix, int target) {
        int r = 0;
//        int c = matrix.length - 1;
        int c = matrix[r].length - 1;   // // if not Square Matrix then put the values of mXn

        while (r < matrix.length && c >=0) {
            if(matrix[r][c] == target) {
                return new int[]{r,c};
            }
            if(matrix[r][c] < target) {
                r++;
            } else {    // (matrix[r][c] > target)
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}