package day1.Ch04.Ex04_4;

import java.util.*;
import java.io.*;

public class P12891_DNA_정답 {
    static int checkArr[];
    static int myArr[];
    static int checkSecret;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int Result = 0;
        char A[] = new char[S];
        checkArr = new int[4];
        myArr = new int[4];
        checkSecret = 0;
        A = bf.readLine().toCharArray();
        st = new StringTokenizer(bf.readLine());
        for (int i=0; i<4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if (checkArr[i] == 0) {
                checkSecret++;
            }
        }
        for (int i=0; i<P; i++) { // 초기 P 부분 문자열 처리 부분
            int j = i - P;
            Add(A[i]);
            Remove(A[j]);
            if (checkSecret == 4) {
                Result++;
            }
            System.out.println(Result);
            bf.close();
        }



    }
    private static void Add(char c) {

    }
    private static void Remove(char c) {

    }
}
