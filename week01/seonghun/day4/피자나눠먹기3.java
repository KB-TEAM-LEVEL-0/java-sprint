package day4;

public class 피자나눠먹기3 {
    public int solution(int slice, int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            if(slice * i >= n) {
                return i;
            }
        }
        return answer;
    }
}
