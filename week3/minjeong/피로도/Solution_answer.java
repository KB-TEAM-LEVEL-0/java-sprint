package 피로도;

import java.util.*;

public class Solution_answer {
    boolean[] visited;
    int answer = 0;

    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(k, dungeons, 0);
        return answer;
    }

    private void dfs(int fatigue, int[][] dungeons, int count) {
        // 현재까지 탐험한 던전 개수 최댓값 갱신
        answer = Math.max(answer, count);
        // 모든 던전을 하나씩 확인
        for (int i = 0; i < dungeons.length; i++) {
            // 아직 방문하지 않았고, 현재 피로도로 입장 가능하면
            if (!visited[i] && fatigue >= dungeons[i][0]) {
                // 방문 처리
                visited[i] = true;
                // 피로도를 소모하고 다음 던전 탐색
                dfs(fatigue - dungeons[i][1], dungeons, count + 1);
                // 다른 순서도 탐색하기 위해 방문 취소
                visited[i] = false;
            }
        }
    }
}
