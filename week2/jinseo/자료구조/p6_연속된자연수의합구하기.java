package jinseo.자료구조;

import java.util.Scanner;
import java.io.IOException;

public class p6_연속된자연수의합구하기 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;

        while(end_index != N){//지정한 숫자까지 도달했을때 스톱

            if(sum == N){//연속된 수를 찾았을때
                count++;
                end_index++;
                sum= sum+end_index;
            } else if (sum > N) {//일치하는 수를 찾기 -> 크면 앞에 짜르기
                sum = sum - start_index;
                start_index++;
            } else {//일치하는 수를 찾기 -> 작으면 뒤에 짜르기
                end_index++;
                sum = sum + end_index;
            }

        }
        System.out.println(count);

    }
}