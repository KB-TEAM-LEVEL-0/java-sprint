package day1.Ch03.Ex03_4;

public class MOD {
    public static void main(String[] args) {
        long answer = 1;
        for (int i = 1; i <= 50; i++) {
//            answer = answer * i;
            answer = (answer * i)%10007; // 곱셈을 수행할 때마다 나머지 연산을 수행하는 로직
        }
        System.out.println(answer%10007); // 곱한 값을 10007로 나머지 연산을 수행하는 로직
    }
}
