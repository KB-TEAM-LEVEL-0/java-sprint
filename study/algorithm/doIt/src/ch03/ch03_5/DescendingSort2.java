package ch03.ch03_5;
import java.util.Arrays;

public class DescendingSort2 {
    public static void main(String[] args) {
        int[] A = {5, 3, 2, 4, 1};
        negate(A); // 부호 반전
        Arrays.sort(A);
        negate(A);
        System.out.println(Arrays.toString(A));
    }
    static void negate(int[] temp) {
        for (int i=0; i<temp.length; i++) {
            temp[i]*=1;
        }
    }
}
