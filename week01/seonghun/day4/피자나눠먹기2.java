package day4;

public class 피자나눠먹기2 {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            if((6 * i % n) == 0){
                answer = i;
                return answer;
            }
        }
        return answer;
    }
}
