import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        // n * n 크기 정사각 격자
        // 바구니 : stack?
        // 같은 모양 인형 2개 쌓이면 -> 사라짐 (터짐)
        // 인형이 없는 곳은 아무 일도 일어나지 않음

        // board = [
        //  [0,0,0,0,0],
        //  [0,0,1,0,3],
        //  [0,2,5,0,1],
        //  [4,2,4,4,2],
        //  [3,5,1,3,1]
        // ]

        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        int before = 0;

        for(int move : moves) {
            // 1. 인형을 뽑는데 없으면(0)이면 다음 행으로
            // move : 열
            // 인형의 종류는 5개?
            // j : 행
            for(int j=0; j<5; j++) {
                if(board[j][move]==0) {
                    continue;
                }else {
                    if(before == board[j][move]) {
                        // 이전 넘버와 같으면 저장하지 않고 pop
                        stack.pop();
                        answer+=2;
                        board[j][move] = 0;
                        board[j-1][move] = 0;
                    }else {
                        stack.push(board[j][move]);
                        // 이전 번호 저장
                        before = board[j][move];
                    }
                    System.out.print(stack);
                }
            }
        }
        return answer;
    }
}
