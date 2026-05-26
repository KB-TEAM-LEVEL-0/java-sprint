package Day9;

public class 구슬을나누는경우의수 {
    public int solution(int balls, int share) {

        long answer = 1;

        for (int i = 0; i < share; i++) {
            answer = answer * (balls - i) / (i + 1);
        }
        return (int) answer;
    }
}
