package week4.jinseo.Day6;

import java.util.ArrayList;
import java.util.List;

class Description {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backtrack(result, new ArrayList<>(), nums, visited);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, boolean[] visited) {
        // 1. 종료 조건: 숫자를 모두 다 뽑았을 때
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        // 2. 반복문(for문): 매 단계마다 모든 숫자를 검사
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) continue; // 이미 사용한 숫자는 건너뜀

            visited[i] = true;      // 사용 표시
            tempList.add(nums[i]);  // 숫자 선택

            backtrack(result, tempList, nums, visited); // 다음 숫자 뽑으러 재귀 호출

            // 3. 복구 (백트래킹의 핵심)
            tempList.remove(tempList.size() - 1);
            visited[i] = false;
        }
    }
}