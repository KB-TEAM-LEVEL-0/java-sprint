package ch04.ch04_1;
import java.util.*;

public class P1546_평균 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n : 시험을 본 과목 수
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }
        long sum = 0;
        long max = 0;
        for(int i=0; i<N; i++) {
            if (A[i] > max) {
                max = A[i];
            }
            sum = sum + A[i];
        }
        System.out.println(sum * 100.0 / max / N);
    }
}
