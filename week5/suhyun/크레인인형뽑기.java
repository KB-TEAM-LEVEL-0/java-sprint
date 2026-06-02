package suhyun;

import java.util.Stack;

class 크레인인형뽑기 {
    public int solution(int[][] board, int[] moves) {
        /*
         - 스택 개념
         - 인형을 바구니에 담을 때 밑에서부터 쌓이고, 나중에 들어간 게 먼저 나오는 LIFO 구조
         - 그냥 배열이나 리스트보다 스택을 쓰는 게 제일 효율적인 것 같음.
         - push()로 인형을 넣고, 맨 위에 있는 인형을 peek()로 확인해서 지금 뽑은 거랑 같으면
         - pop()으로 같이 터뜨려버리는 식. 비어있을 때 에러 안 나게 isEmpty() 체크.
         */

        Stack<Integer> basket = new Stack<>();
        int answer = 0;

        for (int move : moves) {
            int col = move - 1; // 배열 인덱스는 0부터니까 1 빼줌

            for (int i = 0; i < board.length; i++) {
                if (board[i][col] != 0) {
                    int doll = board[i][col];
                    board[i][col] = 0; // 뽑은 자리는 빈칸 처리

                    // 스택 맨 위 인형이랑 지금 뽑은 인형 비교
                    if (!basket.isEmpty() && basket.peek() == doll) {
                        basket.pop();
                        answer += 2;
                    } else {
                        basket.push(doll);
                    }
                    break;
                }
            }
        }
        return answer;
    }


}