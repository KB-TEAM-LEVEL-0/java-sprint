package week3.jinseo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class 주몽의명령 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 재료의 개수
        int M = Integer.parseInt(br.readLine()); // 갑옷이 되는 번호의 합

        int[] A = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        // 투 포인터를 사용하기 위해 배열 정렬
        Arrays.sort(A);

        int count = 0;
        int i = 0;      // start_index (가장 작은 값 쪽)
        int j = N - 1;  // end_index (가장 큰 값 쪽)

        while (i < j) {
            if (A[i] + A[j] < M) {
                i++; // 합이 작으므로 작은 수를 키움
            } else if (A[i] + A[j] > M) {
                j--; // 합이 크므로 큰 수를 줄임
            } else {
                count++; // 합이 딱 맞음
                i++;
                j--;
            }
        }
        System.out.println(count);
    }
}