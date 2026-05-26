package day4;

public class 배열의평균값 {
    public double solution(int[] numbers) {
        double answer = 0;
        double num = 0;
        for(int number : numbers) {
            num += number;
        }
        answer = num / numbers.length;
        return answer;
    }
}
