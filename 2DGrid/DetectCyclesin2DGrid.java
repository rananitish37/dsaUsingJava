package 2DGrid;

public class DetectCyclesin2DGrid {
    public static void main(String[] args) {
        char [][] grid = {{'a','a','a','a'},{'a','b','b','a'},{'a','b','b','a'},{'a','a','a','a'}};
        DetectCyclesin2DGrid d = new DetectCyclesin2DGrid();
        d.containsCycle(grid);
    }
    public boolean containsCycle(char[][] grid) {
        int n = grid.length, m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        boolean[][] visInPath = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] != '.' && !vis[i][j]) {
                    if(detectCycle(grid, i, j, vis, visInPath, -1, -1, n, m)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean detectCycle(char[][] grid, int i, int j, boolean[][] vis,boolean[][] visInPath, int pi, int pj, int n, int m) {
        vis[i][j] = true;
        visInPath[i][j] = true;
        int[][] dirs = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        for (int[] d : dirs) {
            int ni = i + d[0], nj = j + d[1];

            if (ni >= 0 && ni < n && nj >= 0 && nj < m && grid[ni][nj] == grid[i][j]) {
                if (visInPath[ni][nj] && (ni != pi || nj != pj))
                    return true;
                if (!vis[ni][nj] && detectCycle(grid, ni, nj, vis,visInPath, i, j,n,m))
                    return true;
            }
        }
        return false;
    }
}
