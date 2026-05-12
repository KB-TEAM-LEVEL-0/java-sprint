package day3;

import java.util.Arrays;

public class 중앙값구하기 {
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
    }
}
