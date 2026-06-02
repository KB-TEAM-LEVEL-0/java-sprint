package Day7;

public class 각도기 {
    public int solution(int angle) {
        int answer = (angle >= 180)? 4 : (angle >90)? 3 : (angle == 90)? 2 : 1;
        return answer;
    }
}
