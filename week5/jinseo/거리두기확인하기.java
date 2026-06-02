package week5.jinseo;

public class 거리두기확인하기 {
    class Solution {

        static int[] dr = {0, 1, 0, -1};
        static int[] dc = {1, 0, -1, 0};

        public int[] solution(String[][] places) {

            int[] answer = new int[5];

            for (int i = 0; i < 5; i++) {

                if (checkPlace(places[i])) {
                    answer[i] = 1;
                } else {
                    answer[i] = 0;
                }
            }
            return answer;

        }

        boolean checkPlace(String[] place){

            for(int r = 0; r < 5; r++){

                for(int c = 0; c<5; c++){

                    char current = place[r].charAt(c);

                    if(current == 'P'){
                        if(checkChar(place, r, c) >= 1) return false;
                    } else if(current == 'O') {
                        if(checkChar(place, r, c) >= 2) return false;
                    }
                }
            }
            return true;
        }

        int checkChar(String[] place, int r, int c){

            int count = 0;
            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];


                if (nr >= 0 && nr < 5 && nc >= 0 && nc < 5) {
                    if (place[nr].charAt(nc) == 'P') {
                        count++;
                    }
                }
            }
            return count;
        }
    }
}