package Day11;

import java.util.Arrays;

public class 최대값만들기1 {
    public int solution(int[] numbers) {

        Arrays.sort(numbers);

        int n = numbers.length;

        return numbers[n - 1] * numbers[n - 2];

    }
}
