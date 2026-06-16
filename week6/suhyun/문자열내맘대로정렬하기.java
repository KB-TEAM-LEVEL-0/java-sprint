package suhyun;

import java.util.Arrays;


class 문자열내맘대로정렬하기 {

    public String[] solution(String[] strings, int n) {
        // s1과 s2를 비교해서 양수가 나오면 자리를 바꾸고, 음수가 나오면 그대로 둠
        Arrays.sort(strings, (s1, s2) -> {

            // n번째 인덱스의 문자가 같다면
            if (s1.charAt(n) == s2.charAt(n)) {

                // 문자열 전체를 사전순으로 비교함 (compareTo 메서드 사용)
                // 두 가지의 값을 비교할 때 사용하는 함수로 숫자와 문자열 모두를 비교 가능
                return s1.compareTo(s2);
            }
            // n번째 인덱스의 문자가 다르다면
            // 해당 문자끼리 비교해서 오름차순(아스키코드 값 차이)으로 정렬함
            return s1.charAt(n) - s2.charAt(n);

        });


        return strings;

    }

}