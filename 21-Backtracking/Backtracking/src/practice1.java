public class practice1 {
    public static void main(String[] args) {
//        System.out.println(count(3,3));
//        path("", 3, 3);

        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        allPath("", board, 0, 0);
    }

    static void allPath(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) return;

        maze[r][c] = false;

        if (r < maze.length - 1) {
            allPath(p + 'R', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            allPath(p + 'D', maze, r, c + 1);
        }
        if (r > 0) {
            allPath(p + 'L', maze, r - 1, c);
        }
        if (c > 0) {
            allPath(p + 'U', maze, r, c - 1);
        }

        maze[r][c] = true;
    }

    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int left = count(r - 1, c);
        int right = count(r, c - 1);

        return left + right;
    }

    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1) {
            path(p + 'R', r - 1,c );

        }
        if (c > 1) {
            path(p + 'D', r, c - 1);
        }
    }
}
