package 소수찾기;

import java.util.HashSet;
import java.util.Set;

class Solution_answer {
    // 해시 셋 선언
    Set<Integer> set = new HashSet<>();
    boolean[] visited;

    public int solution(String numbers) {
        visited = new boolean[numbers.length()];

        dfs("", numbers);

        int answer = 0;
        for (int num : set) {
            if (isPrime(num)) {
                answer++;
            }
        }

        return answer;
    }

    // 숫자 조합 만들기
    private void dfs(String current, String numbers) {
        if (!current.equals("")) {
            set.add(Integer.parseInt(current));
        }

        for (int i = 0; i < numbers.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(current + numbers.charAt(i), numbers);
                visited[i] = false;
            }
        }
    }

    // 소수 판별
    private boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}