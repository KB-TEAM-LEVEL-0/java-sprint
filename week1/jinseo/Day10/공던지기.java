package Day10;

public class 공던지기 {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int index = 0;

        for(int i = 0; i < k-1; i++) {
            index = (index+2)%numbers.length;
        }
        answer = numbers[index];
        return answer;
    }
    }
