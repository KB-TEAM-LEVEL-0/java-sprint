package week3.jinseo;

import java.util.Scanner;

public class 평균구하기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int score[] = new int[N];
        for (int i = 0; i < N; i++) {
            score[i] = sc.nextInt();
        }

        long sum = 0;
        long max = 0;

        for (int i = 0; i < N; i++) {
            if (score[i] > max) {max = score[i];}
            sum = sum + score[i];
        }
        // 한 과목과 관련된 수식을 총합과 관련된 수식으로 변환해 로직이 간단해짐
        // 이 식 만드는게 HITTTTTO~ 0_<
        System.out.println(sum * 100.0 / max / N);
    }

}