package 전력망나누기;

import java.util.*;

public class Solution_answer {
    public int solution(int n, int[][] wires) {
        // 최소 차이값 저장
        int answer = Integer.MAX_VALUE;

        // 전선을 하나씩 끊어보며 완전탐색
        for (int cut = 0; cut < wires.length; cut++) {

            // 인접 리스트 그래프 생성
            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

            // 1번부터 n번 송전탑까지 사용할 리스트 초기화
            for (int i = 0; i <= n; i++) {
                graph.add(new ArrayList<>());
            }

            // 끊을 전선을 제외하고 그래프 연결
            for (int i = 0; i < wires.length; i++) {

                // 현재 끊을 전선이면 건너뛰기
                if (i == cut) continue;

                // 전선으로 연결된 한쪽 송전탑 번호 저장
                int a = wires[i][0];

                // 전선으로 연결된 다른 쪽 송전탑 번호 저장
                int b = wires[i][1];

                // 양방향 연결
                graph.get(a).add(b);
                graph.get(b).add(a);
            }

            // 방문 배열 생성
            boolean[] visited = new boolean[n + 1];

            // DFS로 1번 송전탑과 연결된 송전탑 개수 세기
            int count = dfs(1, graph, visited);

            // 나머지 전력망의 송전탑 개수 계산
            int other = n - count;

            // 두 전력망의 송전탑 개수 차이 계산
            int diff = Math.abs(count - other);

            // 최소 차이값 갱신
            answer = Math.min(answer, diff);
        }

        // 최종 최소 차이 반환
        return answer;
    }

    private int dfs(int current, ArrayList<ArrayList<Integer>> graph, boolean[] visited) {
        // 현재 송전탑 방문 처리
        visited[current] = true;

        // 현재 송전탑 1개를 개수에 포함
        int count = 1;

        // 현재 송전탑과 연결된 다음 송전탑들을 순회
        for (int next : graph.get(current)) {

            // 아직 방문하지 않은 송전탑이면
            if (!visited[next]) {

                // DFS로 이어진 송전탑 개수를 누적
                count += dfs(next, graph, visited);
            }
        }

        // 현재 송전탑에서 갈 수 있는 전체 송전탑 개수 반환
        return count;
    }
}