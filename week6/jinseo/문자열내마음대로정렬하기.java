package week6.jinseo;

import java.util.Arrays;

public class 문자열내마음대로정렬하기 {
    public String[] solution(String[] strings, int n) {

        // Arrays.sort(대상, 규칙)
        Arrays.sort(strings, (s1, s2) -> {

            if (s1.charAt(n) != s2.charAt(n)) { // n번째 값이 같지 않을 때
                return Character.compare(s1.charAt(n), s2.charAt(n)); // n번째 글자를 기준으로 오름차순(사전순) 정렬
            }
            return s1.compareTo(s2); // 같을 경우 단어 자체로 구분
        });

        return strings;

    }
}
