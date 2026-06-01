import java.util.*;

class Solution {
    /* 매개변수 */
    // places : 자리에 앉아 있는 응시자들의 정보와
    //          대기실 구조를 대기실별로 담은 2차원 문자열 배열

    // 5 * 5
    // 행 길이(대기실 개수) : 5
    // 열 길이(대기실 세로 길이) : 5

    /* places 원소 : P, O, X */
    // P : 응시자가 앉아있는 자리
    // O : 빈 테이블
    // X : 파티션

    /* 거리두기 */
    // 맨해튼 거리 2 이하 x
    // (r1, c1), (r2, c2) -> |r1 - r2| + |c1 - c2|

    /* return */
    // 대기실별로 거리두기를
    // 지키고 있으면 1
    // 지키지 않고 있으면 0

    // ------------------------------

    /* 이동 방향(Direction)을 저장한 배열 */
    // dx(행), dy(열) : 현재 위치에서 얼마나 이동할지 저장한 배열

    // static : 객체를 생성하지 않아도 공통으로 사용하도록 (다른 메서드에서도 공용으로 사용)
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public int[] solution(String[][] places) {
        int[] answer = new int[5];

        // i : 행
        for(int i=0; i<5; i++) {
            answer[i] = check(places[i]) ? 1 : 0;
        }
        return answer;
    }

    // check() : 각 대기실 검사
    // 문제 없음 = 1
    // 위반 있음 = 0
    public boolean check(String[] place) {
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                // 응시자 P 발견 -> BFS 시작
                if (place[i].charAt(j) == 'P') {
                    if(!bfs(place, i, j)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public boolean bfs(String[] place, int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[5][5];

        // 정수 배열 생성 (x좌표, y좌표, 시작점으로부터의거리)
        // queue.offer() : Queue에 값을 넣는 메서드
        queue.offer(new int[]{startX, startY, 0});
        visited[startX][startY] = true;

        // 큐가 빌 때까지 반복
        while(!queue.isEmpty()) {
            // 큐에서 현재 위치 꺼내기
            int[] cur = queue.poll();

            int x = cur[0];
            int y = cur[1];
            int dist = cur[2];

            // 맨해튼 거리 위반하지 않음
            if (dist >= 2 ) {
                continue;
            }

            // 현재 위치에서 상하좌우 탐색 (4방향)
            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];

                // 배열 범위를 벗어나는 좌표를 제거 (5*5)
                if(nx < 0 || nx >= 5 || ny < 0 || ny >= 5) {
                    continue;
                }

                // 재탐색 X
                if(visited[nx][ny]) {
                    continue;
                }

                // 파티션
                if(place[nx].charAt(ny) == 'X') {
                    continue;
                }

                // 근처에 다른 사람 P 있으면 종료
                if(place[nx].charAt(ny) == 'P') {
                    return false;
                }

                visited[nx][ny] = true;
                queue.offer(new int[] {nx, ny, dist + 1});
            }
        }

        return true;
    }
}