package Day8;

import java.util.Arrays;

public class 배열자르기 {
    public int[] solution(int[] numbers, int num1, int num2) {
        //배열.copyofRange(이전배열, 시작인덱스, 끝인덱스)
        int[] sliced = Arrays.copyOfRange(numbers, num1, num2 + 1);
        return sliced;
    }
}
