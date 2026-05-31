import java.util.*;

class Solution {
    List<List<Integer>> tree;
    boolean[] visited;
    int min;
    public int solution(int n, int[][] wires) {
        tree = new ArrayList();
        visited = new boolean[n];
        min = n;

        for(int i = 0; i < n; i++) {
            tree.add(new ArrayList());
        }

        for(int[] e : wires) {
            tree.get(e[0] - 1).add(e[1] - 1);
            tree.get(e[1] - 1).add(e[0] - 1);
        }

        dfs(0);

        return min;
    }

    int dfs(int root) {
        visited[root] = true;

        int count = 1;
        for(int child : tree.get(root)) {
            if(!visited[child]) {
                count += dfs(child);
            }
        }

        int c1 = tree.size() - count;
        int c2 = count;

        min = Math.min(min, Math.abs(c1 - c2));

        return count;
    }
}