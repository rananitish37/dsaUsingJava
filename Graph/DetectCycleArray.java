package Graph;

public class DetectCycleArray {
    public static boolean containsCycle(char[][] grid) {
        int n = grid.length, m = grid[0].length;
        boolean[][] vis = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] != '.' && !vis[i][j]) {
                    if(detectCycle(grid, i, j, vis, -1, -1, n, m)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean detectCycle(char[][] grid, int i, int j, boolean[][] vis, int pi, int pj, int n, int m) {
        vis[i][j] = true;
        int[][] dirs = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        for (int[] d : dirs) {
            int ni = i + d[0], nj = j + d[1];

            if (ni >= 0 && ni < n && nj >= 0 && nj < m && grid[ni][nj] == grid[i][j]) {
                if (vis[ni][nj] && (ni != pi || nj != pj))
                    return true;
                if (!vis[ni][nj] && detectCycle(grid, ni, nj, vis, i, j,n,m))
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        char[][] grid = {{'a','a','a','a'},{'a','b','b','a'},{'a','b','b','a'},{'a','a','a','a'}};
        System.out.println(containsCycle(grid));
    }
}
