package Day11;

public class 펙토리얼 {
    public int solution(int n) {
        int answer = 0;
        int p = 1;

        while(true){
            answer++;
            p *= answer;

            if(p > n){
                return answer -1;
            }else if(p == n) {
                return answer;
            }
        }
    }
}
