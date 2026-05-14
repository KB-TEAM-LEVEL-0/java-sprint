package day1.Ch04.Ex04_1;

import java.util.Scanner;

public class P1546_평균 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cNum = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            cNum[i] = sc.nextInt();
            if (cNum[i] > max) {
                max = cNum[i];
            }
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (double) cNum[i]/max*100;
        }
        System.out.println(sum/n);
    }

}
