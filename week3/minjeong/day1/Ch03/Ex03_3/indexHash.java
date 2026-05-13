package day1.Ch03.Ex03_3;

import java.io.*;
import java.util.StringTokenizer;

public class indexHash {
    // 계수 정렬 : 인덱스에 의미를 부여한 대표 사례
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] count = new int[1001];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(st.nextToken());
            count[number]++; // 인덱스에 숫잣값으로 의미를 부여해 데이터를 저장
        }
        br.close();
        for (int i = 0; i <= 1000; i++) {
            if(count[i] != 0) {
                for (int j=0; j < count[i]; j++) {
                    bw.write(i + " ");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
