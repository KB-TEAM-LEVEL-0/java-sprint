package 전력망나누기;

import java.util.*;

public class Solution {
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        for (int cut = 0; cut < wires.length; cut++) {
            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

            for(int i = 0; i <= n; i++) {
                graph.add(new ArrayList<>());
            }

            for(int i = 0; i < wires.length; i++) {
                if (i == cut) continue;

                int a = wires[i][0];
                int b = wires[i][1];

                graph.get(a).add(b);
                graph.get(b).add(a);
            }
            boolean[] visited = new boolean[n + 1];
            int count = dfs(1, graph, visited);
            int other = n - count;
            int diff = Math.abs(count - other);
            answer = Math.min(answer, diff);
        }
        return answer;
    }

    private int dfs(int current, ArrayList<ArrayList<Integer>> graph, boolean[] visited ) {
        visited[current] = true;
        int count = 1;

        for (int next : graph.get(current)) {
            if(!visited[next]) {
                count += dfs(next, graph, visited);
            }
        }
        return count;
    }
}