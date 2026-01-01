public class BackTrackingMazeWithAllDirection03 {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        allPaths("", board, 0, 0);
    }
    static void allPaths(String p, boolean[][] maze, int r, int c) {

        // leads to stack overflow
        // you may return to same position (0,0) in recursion call
        // it will happen again & again ----> leads to stack overflow
        // to solve this problem
        // mark cells which are already visited --> "false"


        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if(!maze[r][c]) {
            return;
        }

        maze[r][c] = false;

        if (r < maze.length - 1) {
            allPaths(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            allPaths(p + 'R', maze, r, c + 1);
        }
        if (r > 0) {
            allPaths(p + 'U', maze, r - 1, c);
        }
        if (c > 0) {
            allPaths(p + 'L', maze, r, c - 1);
        }

        // this is the where the function will be over
        // so before the function gets removes, also remove the changes that were made by that function
        // This is "BACKTRACKING"

        maze[r][c] = true;
    }
}
