package day5;

public class 아이스아메리카노 {
    public int[] solution(int money) {
        int[] answer = {0, 0};
        answer[0] = money / 5500;
        answer[1] = money % 5500;
        return answer;
    }
}
