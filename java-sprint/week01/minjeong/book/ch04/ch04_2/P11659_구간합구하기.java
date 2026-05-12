package ch04.ch04_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11659_구간합구하기 {
    public static void main(String[] args) throws IOException {
        // 입력 처리 코드
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 데이터 개수, 질의 개수
        int suNo = Integer.parseInt(st.nextToken());
        // 구간 합을 구할 대상 배열
        int quizNo = Integer.parseInt(st.nextToken());

        long[] S = new long[suNo + 1];
        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= suNo; i++) {
            S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
        }

        for (int q = 0; q < quizNo; q++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(S[i] - S[i - 1]);
        }


    }

}
