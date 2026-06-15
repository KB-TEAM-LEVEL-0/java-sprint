import java.util.Arrays;

class Solution {
    public long solution(int[] weights) {
        long answer = 0;

        Arrays.sort(weights);

        for (int i = 0; i < weights.length; i++) {
            for (int j = i + 1; j < weights.length; j++) {

                if (weights[j] > weights[i] * 2) {// 이탈하는 조건 제거
                    break;
                }

                // 조건 확인
                if (weights[i] == weights[j] ||
                        weights[i] * 3 == weights[j] * 2 || // 3 2
                        weights[i] * 4 == weights[j] * 2 || // 4 2
                        weights[i] * 4 == weights[j] * 3) { // 4 3

                    answer++;
                }
            }
        }

        return answer;
    }
}