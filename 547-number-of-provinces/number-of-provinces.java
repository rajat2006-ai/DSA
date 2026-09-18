class Solution {
    public int findCircleNum(int[][] adj) {
        int n = adj.length;
        int count = 0;
        boolean[] vis = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                dfs(i, vis, adj);
                count++;
            }
        }

        return count;
    }

    public void dfs(int i, boolean[] vis, int[][] adj) {
        int n = adj.length;

        Queue<Integer> q = new LinkedList<>();

        vis[i] = true;
        q.add(i);

        while (!q.isEmpty()) {
            int front = q.remove();

            for (int j = 0; j < n; j++) {
                if (adj[front][j] == 1 && !vis[j]) {
                    q.add(j);
                    vis[j] = true;
                }
            }
        }
    }
}