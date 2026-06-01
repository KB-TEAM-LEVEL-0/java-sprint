package week3.jinseo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class 구간합구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));
        //Scanner와 유사 -> 더 빠름

        StringTokenizer stringTokenizer =
                new StringTokenizer(bufferedReader.readLine());
        //문자열로 받기 -> why StreamTokenizer도 있지만 숫자만 가능
        // + Stream은 꺼낼때 Integer없이 (int) st.nval로 바로사용
        // 둘이 속도는 비슷함

        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());

        long[] S = new long[suNo + 1];
        // i-1을 위해서 '+1' 추가

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for (int i = 1; i <= suNo; i++) {
            S[i] = S[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int q = 0; q < quizNo; q++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j] - S[i - 1]);
        }
    }
}