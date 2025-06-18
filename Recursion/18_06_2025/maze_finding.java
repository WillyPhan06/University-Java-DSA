public class Main {
    static int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 0},
            {0, 1, 0, 0},
            {0, 1, 1, 1}
    };

    static int[][] path = new int[4][4]; // to store the path

    static int ROWS = maze.length;
    static int COLS = maze[0].length;

    public static void main(String[] args) {
        if (findPath(0, 0)) {
            System.out.println("Path found:");
            printPath();
        } else {
            System.out.println("No path found.");
        }
    }

    static boolean findPath(int row, int col) {
        // Base case: reached destination
        if (row == ROWS - 1 && col == COLS - 1 && maze[row][col] == 1) {
            path[row][col] = 2;
            return true;
        }

        // Check if current cell is valid
        if (isSafe(row, col)) {
            // Mark cell as part of path
            path[row][col] = 2;

            // Move down
            if (findPath(row + 1, col)) return true;

            // Move right
            if (findPath(row, col + 1)) return true;

            // Move up
            if (findPath(row - 1, col)) return true;

            // Move left
            if (findPath(row, col - 1)) return true;

            // Backtrack: unmark this cell
            path[row][col] = 0;
        }

        return false;
    }

    static boolean isSafe(int row, int col) {
        return row >= 0 && row < ROWS &&
                col >= 0 && col < COLS &&
                maze[row][col] == 1 &&
                path[row][col] == 0;
    }

    static void printPath() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print(path[i][j] + " ");
            }
            System.out.println();
        }
    }
}
