import java.util.LinkedList;
import java.util.Queue;

class 거리두기 {
    // 상하좌우 이동하려고 미리 세팅은 해둠
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};

    public int[] solution(String[][] places) {
        int[] answer = new int[5];

        for (int i = 0; i < 5; i++) {
            String[] place = places[i];

            // 대기실 하나씩 5x5 탐색 시작
            for (int r = 0; r < 5; r++) {
                for (int c = 0; c < 5; c++) {
                    if (place[r].charAt(c) == 'P') {
                        /*
                         * 사람(P) 찾았으니 여기서부터 BFS
                         * Queue<int[]> queue = new LinkedList<>();
                         * 여기까지는 알겠는데, 거리가 2 이하인 거 체크하면서
                         * 파티션(X) 만나면 멈춰야 하는 것 같은데..
                         */
                    }
                }
            }
            answer[i] = 1; // 로직 완성 못해서 일단 다 거리두기 지켰다고 1 넣고 끝냄
        }
        return answer;
    }
}