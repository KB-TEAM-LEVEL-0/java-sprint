class 모음사전 {
    // 사전 순서대로 탐색할 모음 배열 세팅
    char[] vowels = {'A', 'E', 'I', 'O', 'U'};
    int answer = 0;
    int count = 0;

    public int solution(String word) {
        dfs("", word);
        return answer;
    }

    public void dfs(String current, String target) {
        // 기저 조건: 단어 길이는 최대 5글자까지만 가능하므로 그 이상은 탐색 안 함
        if (current.length() > 5) {
            return;
        }

        // 탐색한 단어가 target과 일치하면 정답에 현재까지의 카운트를 저장
        if (current.equals(target)) {
            answer = count;

            /* * [여기서 막힘!]
             * 찾았으니까 여기서 return을 해봤자, 바로 직전 재귀 호출 단계로만 돌아감.
             * 바깥에 있는 for문은 멈추지 않고 계속 돌기 때문에
             * 뒤이어 다른 단어들이 계속 생성되면서 count 값이 엉망으로 계속 증가함...
             * * 무한 재귀 깊은 곳에서 target을 발견했을 때,
             * 더 이상 뒤쪽 스택들을 실행하지 않고 전체 재귀를 '올스톱' 시키는
             * boolean 플래그나 탈출 조건을 어떻게 걸어야 할지 모르겠음.
             */
            return;
        }

        // 빈 문자열이 아닐 때만 카운트 증가 (사전에 등록된 단어 카운팅)
        if (!current.equals("")) {
            count++;
        }

        // 사전순(A-E-I-O-U)으로 글자를 하나씩 붙여가며 깊게 탐색(DFS)
        for (int i = 0; i < 5; i++) {
            dfs(current + vowels[i], target);
        }
    }
}