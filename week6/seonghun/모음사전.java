package week6.seonghun;

import java.util.HashMap;
import java.util.Map;

class 모음사전 {
    public int solution(String word) {
        int answer = 0;

        // 각 자리수별 글자가 바뀔 때 건너뛰는 단어의 개수
        int[] weights = {781, 156, 31, 6, 1};

        // 모음별 인덱스 매핑
        Map<Character, Integer> vowels = new HashMap<>();
        vowels.put('A', 0);
        vowels.put('E', 1);
        vowels.put('I', 2);
        vowels.put('O', 3);
        vowels.put('U', 4);

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            // (앞선 모음들의 개수 * 해당 자리 가중치) + 현재 글자 자체의 번호(1)
            answer += vowels.get(c) * weights[i] + 1;
        }

        return answer;
    }
}