package day1.Ch03.Ex03_1;

public class Main {
    // int 형과 long 형의 표현 범위 비교
    public static void main(String[] args) {
        int a = 1000000000;
        a += 2000000000; // 자료형 범위를 초과하는 연산
        System.out.println(a); // 출력값 : -1294967296

        long b = 1000000000;
        b += 2000000000;
        System.out.println(b); // 출력값 : 3000000000

    }
}