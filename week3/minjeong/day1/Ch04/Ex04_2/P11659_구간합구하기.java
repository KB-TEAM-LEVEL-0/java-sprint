package day1.Ch04.Ex04_2;

import java.util.Scanner;
//1차원 구간합
public class P11659_구간합구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 데이터 개수
        int n = sc.nextInt();
        // 질의 개수
        int m = sc.nextInt();
        // 구간합 구할 대상 배열
        int[] arr = new int[n + 1];

        // 1. 합배열 먼저 생성
        // 합배열 공식 : S[i] = S[i-1] + A[i]
        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i-1] + sc.nextInt();
        }

        // 2. 구간합
        // 구간합 공식 : S[j] - S[i-1]
        for (int r = 0; r < m; r++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            System.out.println(arr[j] - arr[i-1]);

        }

    }
}
