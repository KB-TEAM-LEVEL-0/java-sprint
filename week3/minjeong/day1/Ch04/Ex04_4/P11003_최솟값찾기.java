package day1.Ch04.Ex04_4;

import java.util.*;

public class P11003_최솟값찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int size = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt(); // 배열 값 입력
        }

        Arrays.sort(arr);
        System.out.print(arr);

    }
}
