package week4.jinseo.Day8;

public class 양과늑대 {
    boolean[] visited;
    int maxSheep = 0;

    public int solution(int[] info, int[][] edges) {
        visited = new boolean[info.length];
        visited[0] = true;  // 루트 노드 방문

        dfs(info, edges, 1, 0);
        return maxSheep;
    }

    void dfs(int[] info, int[][] edges, int sheep, int wolf) {
        // 늑대가 양보다 많거나 같으면 종료 (가지치기)
        if (wolf >= sheep) return;

        // 현재 양의 수를 최대값에 반영
        maxSheep = Math.max(maxSheep, sheep);

        // 모든 간선 확인
        for (int[] edge : edges) {
            int parent = edge[0];
            int child = edge[1];

            // 부모는 방문했고, 자식은 미방문인 경우
            if (visited[parent] && !visited[child]) {
                visited[child] = true;

                if (info[child] == 0) {  // 양인 경우
                    dfs(info, edges, sheep + 1, wolf);
                } else {  // 늑대인 경우
                    dfs(info, edges, sheep, wolf + 1);
                }

                visited[child] = false;  // 백트래킹
            }
        }
    }
}
