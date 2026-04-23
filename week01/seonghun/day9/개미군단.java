package day9;

public class 개미군단 {
    public int solution(int hp) {
        int answer = 0;
        answer += hp / 5 + hp % 5 / 3 + hp % 5 % 3 / 1;
        return answer;
    }
}
