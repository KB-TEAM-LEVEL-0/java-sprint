package week3.jinseo.Day7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class 전력망둘로나누기 {
    class Solution {

        static ArrayList<Integer>[] adj;
        static int minDiff;

        public int solution(int n, int[][] wires) {

            minDiff = Integer.MAX_VALUE;
            adj = new ArrayList[n + 1];

            for (int i = 1; i <= n; i++) {
                adj[i] = new ArrayList<>();
            }
            for (int[] wire : wires) {
                adj[wire[0]].add(wire[1]);
                adj[wire[1]].add(wire[0]);
            }
            for (int[] wire : wires) {
                int v1 = wire[0];
                int v2 = wire[1];

                int count = bfs(v1, v2, n);

                int diff = Math.abs(count - (n - count));
                minDiff = Math.min(minDiff, diff);
            }
            return minDiff;
        }

        int bfs(int start, int skip, int n) {


            Queue<Integer> q = new LinkedList<>();
            boolean[] visited = new boolean[n + 1];

            q.add(start);
            visited[start] = true;
            int cnt = 1;

            while (!q.isEmpty()) {
                int cur = q.poll();
                for (int next : adj[cur]) {
                    if (!visited[next] && next != skip) {
                        visited[next] = true;
                        q.add(next);
                        cnt++;
                    }
                }
            }
            return cnt;
        }
    }
}