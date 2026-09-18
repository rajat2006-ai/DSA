class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();

        boolean[] vis = new boolean[n];

        Queue<Integer> q = new LinkedList<>();

        vis[0] = true;
        q.add(0);

        while (!q.isEmpty()) {
            int room = q.remove();

            for (int key : rooms.get(room)) {
                if (!vis[key]) {
                    vis[key] = true;
                    q.add(key);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                return false;
            }
        }

        return true;
    }
}