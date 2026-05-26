package Day5;

public class 배열뒤집기 {
    public int[] solution(int[] num_list) {

        int[] answer = new int[num_list.length];
        int index = 0;

        for(int i = num_list.length; i > 0; i--){
            answer[index] = num_list[i-1];
            index++;
        }

        return answer;
    }
}
