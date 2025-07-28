import java.util.Arrays;

public class Q2SortedMatrix {
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
        System.out.println(Arrays.toString(search(arr2, 0)));
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;  // be cautious matrix may be empty

//        if (cols == 0) {
//            return new int[]{-1, -1};
//        }

        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols-1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        // run the loop till 2 rows are remaining
        while (rStart < (rEnd - 1)) {  // while this is true , it will have more than 2 rows
            int mid = rStart + (rEnd - rStart) / 2;

            if (matrix[mid][cMid] == target) {
                return new int[]{mid , cMid};
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // now we have 2 rows
        // check whether the target is in the col of 2 rows

        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (rStart + 1 < rows && matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        if (cols == 1) {
            return new int[]{-1, -1}; // If the target wasn't found, return [-1, -1]
        }


        // search in 1st half
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid-1, target);
        }
        // search in 2nd half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid+1, cols-1, target);
        }
        // search in 3rd half
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart+1, 0, cMid-1,target);
        }
        // search in 4th half
        else {
            return binarySearch(matrix, rStart+1, cMid+1, cols-1, target);
        }
    }

    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;

            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
}


//import java.util.Arrays;

//public class Q2SortedMatrix {
//    public static void main(String[] args) {
//        int[][] arr = {
//                {1},
//                {3}
//        };
//        System.out.println(Arrays.toString(search(arr, 0))); // Example test case
//    }
//
//    static int[] search(int[][] matrix, int target) {
//        int rows = matrix.length;
//        int cols = matrix[0].length;  // Ensure matrix is not empty
//
//        if (cols == 0) {
//            return new int[]{-1, -1};
//        }
//
//        // If there is only one row, just do binary search
//        if (rows == 1) {
//            return binarySearch(matrix, 0, 0, cols - 1, target);
//        }
//
//        int rStart = 0;
//        int rEnd = rows - 1;
//        int cMid = cols / 2;
//
//        // Run the loop until only 2 rows are remaining
//        while (rStart < (rEnd - 1)) {  // More than 2 rows
//            int mid = rStart + (rEnd - rStart) / 2;
//
//            if (matrix[mid][cMid] == target) {
//                return new int[]{mid, cMid};
//            }
//            if (matrix[mid][cMid] < target) {
//                rStart = mid;
//            } else {
//                rEnd = mid;
//            }
//        }
//
//        // Now, we have two remaining rows (rStart and rStart + 1)
//        if (matrix[rStart][cMid] == target) {
//            return new int[]{rStart, cMid};
//        }
//        if (rStart + 1 < rows && matrix[rStart + 1][cMid] == target) {
//            return new int[]{rStart + 1, cMid};
//        }
//
//        // Handle edge case where there is only one column
//        if (cols == 1) {
//            return new int[]{-1, -1}; // If the target wasn't found, return [-1, -1]
//        }
//
//        // Ensure we don't go out of bounds when checking the 4 quadrants
//        if (cMid - 1 >= 0 && target <= matrix[rStart][cMid - 1]) {
//            return binarySearch(matrix, rStart, 0, cMid - 1, target);
//        }
//        if (cMid + 1 < cols && target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
//            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
//        }
//        if (cMid - 1 >= 0 && rStart + 1 < rows && target <= matrix[rStart + 1][cMid - 1]) {
//            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
//        }
//        if (cMid + 1 < cols && rStart + 1 < rows) {
//            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
//        }
//
//        return new int[]{-1, -1};  // Target not found
//    }
//
//    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
//        while (cStart <= cEnd) {
//            int mid = cStart + (cEnd - cStart) / 2;
//
//            if (matrix[row][mid] == target) {
//                return new int[]{row, mid};
//            }
//            if (matrix[row][mid] < target) {
//                cStart = mid + 1;
//            } else {
//                cEnd = mid - 1;
//            }
//        }
//        return new int[]{-1, -1};  // Target not found
//    }
//}






