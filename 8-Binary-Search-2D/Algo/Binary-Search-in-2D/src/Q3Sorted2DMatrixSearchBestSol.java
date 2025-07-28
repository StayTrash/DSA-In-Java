import java.util.Arrays;

class Q3Sorted2DMatrixSearchBestSol {
    public static void main(String[] args) {
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] arr2 = {
                {1},
                {3}
        };
        System.out.println(Arrays.toString(searchMatrix(arr1, 5)));
    }
    public static int[] searchMatrix(int[][] matrix, int target) {
        // imagine 2d array as 1d array

        int m = matrix.length;    // Number of rows
        int n = matrix[0].length; // Number of columns

        int start = 0;
        int end = n * m - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int row = mid / n;  // Corrected row calculation
            int col = mid % n;  // Corrected column calculation

            if (matrix[row][col] == target) {
                return new int[]{row, col};
            }

            if (target > matrix[row][col]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return new int[]{-1, -1};
    }
}