package suhyun.자료구조;

import java.io.IOException;
import java.util.Scanner;

public class P5_나머지합 {
    // (A + B) % C == ((A % C) + (B % C)) % C
    // S[j] - S[i] == 원본 배열의 i+1부터 j까지의 구간 합
    // S[j] % M과 S[i] % M의 값이 같다면 (S[j] - S[i]) % M == 0
    // -> 즉, 구간 합 배열의 원소를 M으로 나눈 나머지로 업데이트하고 S[j]와 S[i]가
    // 같은 (i, j)쌍을 찾으면 원본 배열에서 i+1부터 j까지의 구간 합이 M으로
    // 나누어 떨어진다는 것을 알 수 있음

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] S = new long[N];
        long[] C = new long[M];
        long answer = 0;
        S[0] = sc.nextInt();
        for (int i = 1; i < N; i++) {
            S[i]= S[i-1]+sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            int remainder = (int) (S[i] % M);
            if (remainder==0) answer++;
            C[remainder]++;
        }
        for (int i = 0; i < M; i++) {
            if (C[i] > 1) {
                answer = answer + (C[i] * (C[i] - 1) / 2);
            }
        }
        System.out.println(answer);
    }
}
