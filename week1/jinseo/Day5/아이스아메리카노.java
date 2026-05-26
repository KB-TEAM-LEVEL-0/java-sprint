package Day5;

public class 아이스아메리카노 {
    public int[] solution(int money) {
        int[] answer = new int [2];

        for(int i = 1; i < 200; i++){
            if(i*5500 <= money){
                answer[0] ++;
            } else {
                answer[1] = (money - ((i-1) * 5500));
                break;
            }
        }

        return answer;
    }
}
