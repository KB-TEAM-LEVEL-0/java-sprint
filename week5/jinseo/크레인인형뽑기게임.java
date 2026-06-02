package week5.jinseo;

import java.util.Stack;

public class 크레인인형뽑기게임 {

    class Solution {
        public int solution(int[][] board, int[] moves) {
            int result = 0;
            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i < moves.length; i++) {
                int index = moves[i] - 1;

                for (int j = 0; j < board.length; j++) {
                    if (board[j][index] != 0) {
                        int num = board[j][index];
                        board[j][index] = 0;

                        if (!stack.isEmpty() && stack.peek() == num) {
                            stack.pop();
                            result += 2;
                        } else {
                            stack.push(num);
                        }
                        break;
                    }
                }
            }
            return result;
        }
    }

}