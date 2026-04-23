package day11;

public class 주사위의개수 {
    public int solution(int[] box, int n) {
        int answer = 1;
        for(int i : box) {
            answer *= i / n;
        }
        return answer;
    }
}
