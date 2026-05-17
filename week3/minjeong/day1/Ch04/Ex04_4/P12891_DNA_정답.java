package day1.Ch04.Ex04_4;

import java.util.*;
import java.io.*;

public class P12891_DNA_정답 {
    static int[] checkArr;
    static int[] myArr;
    static int checkSecret;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int Result = 0;

        char[] A = bf.readLine().toCharArray();

        checkArr = new int[4];
        myArr = new int[4];
        checkSecret = 0;

        st = new StringTokenizer(bf.readLine());

        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());

            if (checkArr[i] == 0) {
                checkSecret++;
            }
        }

        // 1. 초기 P개 문자 추가
        for (int i = 0; i < P; i++) {
            Add(A[i]);
        }

        // 2. 초기 부분 문자열 검사
        if (checkSecret == 4) {
            Result++;
        }

        // 3. 슬라이딩 윈도우
        for (int i = P; i < S; i++) {
            Add(A[i]);
            Remove(A[i - P]);

            if (checkSecret == 4) {
                Result++;
            }
        }

        System.out.println(Result);
        bf.close();
    }

    private static void Add(char c) {
        switch (c) {
            case 'A':
                myArr[0]++;
                if (myArr[0] == checkArr[0]) checkSecret++;
                break;
            case 'C':
                myArr[1]++;
                if (myArr[1] == checkArr[1]) checkSecret++;
                break;
            case 'G':
                myArr[2]++;
                if (myArr[2] == checkArr[2]) checkSecret++;
                break;
            case 'T':
                myArr[3]++;
                if (myArr[3] == checkArr[3]) checkSecret++;
                break;
        }
    }

    private static void Remove(char c) {
        switch (c) {
            case 'A':
                if (myArr[0] == checkArr[0]) checkSecret--;
                myArr[0]--;
                break;
            case 'C':
                if (myArr[1] == checkArr[1]) checkSecret--;
                myArr[1]--;
                break;
            case 'G':
                if (myArr[2] == checkArr[2]) checkSecret--;
                myArr[2]--;
                break;
            case 'T':
                if (myArr[3] == checkArr[3]) checkSecret--;
                myArr[3]--;
                break;
        }
    }
}