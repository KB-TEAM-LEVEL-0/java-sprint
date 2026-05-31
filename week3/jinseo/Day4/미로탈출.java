package week3.jinseo.Day4;

import java.util.LinkedList;
import java.util.Queue;

public class 미로탈출 {
    static int[] dr = {1, 0, -1, 0};
    static int[] dc = {0, 1, 0, -1};
    int n, m;

    public int solution(String[] maps) {
        n = maps.length;
        m = maps[0].length();

        int[] start = new int[2];
        int[] lever = new int[2];
        int[] end = new int [2];

        for(int i = 0; i< n; i++){
            for(int j = 0; j<m; j++){
                char ch = maps[i].charAt(j);
                if(ch== 'S'){
                    start = new int(){i, j};
                }else if(ch== 'L'){
                    lever = new int(){i, j};
                }else if(ch== 'E'){
                    end = new int(){i, j};
                }
            }
        }

        int toLever = bfs(start, lever, maps);
        if(toLever == -1){
            return -1;
        }

        int toEnd = bfs(lever, end, maps);
        if(toEnd == -1){
            return -1;
        }

        return toLever + toEnd;
    }

    public int bfs(int[] from, int[] to, String[]maps){
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];

        queue.add(new int[] {from[0], from[1], 0});
        visited[[from[0]][from[1]]] = true;

        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int r = cur[0];
            int c = cur[1];
            int dist = cur[2];

            if(r == to[0] && c == to[1]){
                return dist;
            }

            for(int i = 0; i < 4; i++){
                int nr = r+ dr[i];
                int nc = r + dc[i];

                if(nr >= 0 && nr< n && nc >= 0 && nr < m){
                    if(maps[nr].charAt(nc) != 'X' && !visited[nr][nc]){
                        visited[nr][nc] = true;
                        queue.add(new int[]{nr,nc,dist+1})
                    }
                }

            }
        }
    }
}