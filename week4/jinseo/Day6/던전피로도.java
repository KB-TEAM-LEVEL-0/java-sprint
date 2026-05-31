package week4.jinseo.Day6;

public class 던전피로도 {
    class Solution {

        int maxCount = 0;

        public int solution(int k, int[][] dungeons) {

            dfs(k, dungeons, 0, new boolean[dungeons.length]);
            return maxCount;
        }

        void dfs(int k, int[][] dungeons, int count, boolean[] visited){

            maxCount = Math.max(maxCount, count);

            for(int i =0; i < dungeons.length; i++){

                if(!visited[i] && k >= dungeons[i][0]){

                    visited[i] = true;
                    dfs(k-dungeons[i][1], dungeons, count + 1, visited);
                    visited[i] = false;
                }

            }

        }
    }
}
