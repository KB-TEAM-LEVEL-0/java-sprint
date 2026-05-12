package assignment.ch04.sec04;

public class SumFrom1To100Example {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1~100 합 : " + sum);
        //   while 문
        int sum2 = 0;
        int n = 1;
        while(n<=100) {
            sum2 += n;
            n++;
        }
        System.out.println("1~100 합 : " + sum2);
    }
}
