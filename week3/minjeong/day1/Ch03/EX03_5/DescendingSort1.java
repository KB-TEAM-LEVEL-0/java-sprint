package day1.Ch03.EX03_5;

import java.util.Arrays;
import java.util.Collections;

public class DescendingSort1 {
    public static void main(String[] args) {
        Integer[] A = {5, 4, 3, 2, 1};
        Arrays.sort(A, Collections.reverseOrder()); // 내림차순 정렬
        System.out.println(Arrays.toString(A));
    }
}
