class Solution {

    public boolean hasValidPath(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        // directions: UP, DOWN, LEFT, RIGHT
        int[][] dirs = {
            {-1,0},
            {1,0},
            {0,-1},
            {0,1}
        };

        // allowed directions for each street
        int[][] street = {
            {},
            {2,3},
            {0,1},
            {2,1},
            {3,1},
            {2,0},
            {3,0}
        };

        // opposite direction mapping
        int[] opposite = {1,0,3,2};

        boolean[][] visited = new boolean[m][n];

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0,0});
        visited[0][0] = true;

        while(!q.isEmpty()) {

            int[] cur = q.poll();
            int r = cur[0];
            int c = cur[1];

            // reached destination
            if(r == m-1 && c == n-1)
                return true;

            int type = grid[r][c];

            // check all valid directions of current street
            for(int dir : street[type]) {

                int nr = r + dirs[dir][0];
                int nc = c + dirs[dir][1];

                // boundary check
                if(nr<0 || nc<0 || nr>=m || nc>=n || visited[nr][nc])
                    continue;

                int nextType = grid[nr][nc];

                // check connection compatibility
                for(int nextDir : street[nextType]) {

                    if(nextDir == opposite[dir]) {
                        visited[nr][nc] = true;
                        q.offer(new int[]{nr,nc});
                    }
                }
            }
        }

        return false;
    }
}