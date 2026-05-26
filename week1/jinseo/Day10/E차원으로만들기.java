package Day10;

public class E차원으로만들기 {

    public int[][] solution(int[] num_list, int n) {

        int index = 0;

        int[][] answer = new int[num_list.length/n][n];

        for (int i =0; i < num_list.length/n; i++){
            for (int j =0; j < n; j++){
                answer[i][j] = num_list[index];
                index++;
            }
        }

        return answer;
    }
}
