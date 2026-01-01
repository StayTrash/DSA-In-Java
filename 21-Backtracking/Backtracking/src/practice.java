import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class practice {
    public static void main(String[] args) {
//        System.out.println(count(3, 3));
//        pathRet1("", 3, 3);
//        System.out.println(pathRet2("", 3, 3));
//        System.out.println(pathRetDiag("", 3, 3));

//        boolean[][] board = {
//                {true, true, true},
//                {true, false, true},
//                {true, true, true}
//        };
//
//        pathRestriction("", board, 0, 0);

//        boolean[][] board = {
//                {true, true, true},
//                {true, true, true},
//                {true, true, true}
//        };

//        allPaths("", board, 0, 0);

//        int[][] path = new int[board.length][board[0].length];
//        allPathsPrint("", board, 0, 0, path, 1);

        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));
    }

    static int count(int r, int c) {
        if (r == 1 || c == 1) return 1;

        int left = count(r - 1,  c);
        int right = count(r, c - 1);

        return left + right;
    }

    static void pathRet1(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1) pathRet1(p + 'D', r - 1, c);
        if (c > 1) pathRet1(p + 'R', r, c - 1);

    }

    static ArrayList<String> pathRet2(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (r > 1) {
            list.addAll(pathRet2(p + 'D', r - 1, c));
        }
        if (c > 1) {
            list.addAll(pathRet2(p + 'R', r, c - 1));
        }

        return list;
    }

    static ArrayList<String> pathRetDiag(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (r > 1 && c > 1) {
            list.addAll(pathRetDiag(p + 'D', r - 1, c- 1));
        }
        if (r > 1) {
            list.addAll(pathRetDiag(p + 'V', r - 1, c));
        }
        if (c > 1) {
            list.addAll(pathRetDiag(p + 'H', r, c - 1));
        }

        return list;
    }

    static void pathRestriction(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) return;

        if (r < maze.length - 1) {
            pathRestriction(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            pathRestriction(p + 'R', maze, r, c + 1);
        }
    }

    static void allPaths(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) return;

        maze[r][c] = false;

        if (r < maze.length - 1) allPaths(p + "D", maze, r + 1, c);
        if (c < maze[0].length - 1) allPaths(p + 'R', maze, r, c + 1);
        if (r > 0) allPaths(p + 'U', maze, r - 1, c);
        if (c > 0) allPaths(p + 'L', maze, r, c - 1);

        maze[r][c] = true;
    }

//    static void allPathsCount(String p, boolean[][] maze, int r, int c) {
//        if (r == maze.length - 1 && c == maze[0].length - 1) {
//            System.out.println(p);
//            return;
//        }
//
//        if (!maze[r][c]) return;
//
//        maze[r][c] = false;
//
//        if (r < maze.length - 1) allPathsCount(p + "D", maze, r + 1, c);
//        if (c < maze[0].length - 1) allPathsCount(p + 'R', maze, r, c + 1);
//        if (r > 0) allPathsCount(p + 'U', maze, r - 1, c);
//        if (c > 0) allPathsCount(p + 'L', maze, r, c - 1);
//
//        maze[r][c] = true;
//    }

    static void allPathsPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;

            for (int[] arr: path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]) return;

        maze[r][c] = false;
        path[r][c] = step;

        if (r < maze.length - 1) allPathsPrint(p + 'D', maze, r + 1, c, path, step + 1);
        if (c < maze[0].length - 1) allPathsPrint(p + 'R', maze, r, c + 1, path, step + 1);
        if (r > 0) allPathsPrint(p + 'U', maze, r - 1, c, path, step + 1);
        if (c > 0) allPathsPrint(p + 'D', maze, r, c - 1, path, step + 1);

        maze[r][c] = true;
        path[r][c] = 0;
    }

    static int queens(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        for (int col = 0; col < board.length; col++) {
            if (safe(board, row, col)) {
                board[row][col] = true;
                count += queens(board, row + 1);
                board[row][col] = false;
            }
        }

        return count;
    }

    static boolean safe(boolean[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }

        return true;
    }

    static void display(boolean[][] board) {
        for (boolean[] row: board) {
            for (boolean element: row) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}

