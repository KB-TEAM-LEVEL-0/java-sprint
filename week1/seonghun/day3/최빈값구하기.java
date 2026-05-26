package day3;

import java.util.HashMap;
import java.util.Map;

public class 최빈값구하기 {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : array) {
            // map에 array에 있는 숫자를 키값으로 이미 숫자가 있으면 가져온 값 +1 없으면 0을 놓고 +1 해서 넣어준다
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int max = 0;
        int answer = 0;

        // map에 있는 데이터들을 k:v 형태로 돌리기
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            if(count > max) {
                max = count;
                answer = num;
            }else if(count == max) {
                answer = -1;
            }
        }

        return answer;
    }
}
