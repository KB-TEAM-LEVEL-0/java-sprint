package Day3;

public class 짝수는싫어요 {
    public int[] solution(int n) {

        int count = 0;

        if(n % 2 == 0){
            int [] answer = new int[n/2];
            for(int i = 1; i <= n; i+=2) {
                answer[count] = i;
                count++;
            }
            return answer;
        }else {
            int [] answer = new int[n/2+1];
            for(int i = 1; i <= n; i+=2) {
                answer[count] = i;
                count++;
            }
            return answer;
        }

    }
}
