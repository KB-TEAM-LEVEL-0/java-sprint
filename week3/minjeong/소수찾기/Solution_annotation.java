package 소수찾기;

public class Solution_annotation {

        // 1. 중복 숫자 제거용 HashSet 선언
        Set<Integer> set = new HashSet<>();

        // 2. 숫자 사용 여부 체크용 visited 배열 선언
        boolean[] visited;

        public int solution(String numbers) {

            // 3. numbers 길이만큼 visited 배열 생성


            // 4. DFS 시작
            // current 문자열은 처음엔 빈 문자열 ""


            // 5. 정답 저장 변수 선언


            // 6. set에 저장된 숫자 하나씩 꺼내기


            // 7. 소수인지 판별


            // 8. 소수면 answer 증가


            // 9. answer 반환


        }

        // 10. 숫자 조합 생성 DFS 메서드
        // current : 현재까지 만든 숫자
        // numbers : 원본 숫자 문자열
        private void dfs(String current, String numbers) {

            // 11. current가 빈 문자열이 아니면


            // 12. current를 정수로 변환 후 set에 저장


            // 13. 모든 숫자 탐색 반복문


            // 14. 아직 방문하지 않은 숫자라면


            // 15. 방문 처리


            // 16. 현재 숫자 뒤에 문자 추가해서 DFS 재귀 호출
            // ex) "1" + '7' -> "17"


            // 17. DFS 종료 후 방문 해제 (백트래킹)


        }

        // 18. 소수 판별 메서드
        private boolean isPrime(int n) {

            // 19. 0과 1은 소수가 아니므로 false 반환


            // 20. 2부터 sqrt(n)까지 반복


            // 21. 나누어 떨어지면 소수 아님


            // 22. 끝까지 안 나눠지면 소수


        }
    }
}
