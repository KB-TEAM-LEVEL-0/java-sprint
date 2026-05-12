package ch04.ch04_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.StringTokenizer;

public class P11659_구간합구하기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //  1. 첫번째 입력값
        // 데이터의 개수
        int N = Integer.parseInt(st.nextToken());
        // 질의 개수
        int M = Integer.parseInt(st.nextToken());

        // 2. 두번째 입력값
        // 구간합을 구할 대상 배열
        long[] S = new long[N + 1];  // 1번부터 시작
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            // "" 으로 split 하던 라이브러리? 뭐더라
            // -> StringTokenizer은 기본적으로 "공백 문자" 기준으로 문자열을 자른다.

            // 합 배열 생성
            // ** 합 배열 공식 : S[i] = S[i-1] + A[i]
            S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
        }
        // 3. 구간 - 질의 개수만큼
        // i ~ j까지의 합 구하기
        for (int q=0; q<M; q++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(S[j] - S[i-1]);
        }




    }

}
