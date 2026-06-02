class 유연근무제 {

    public int timeToMinutes(int time) {
        int h = time / 100;
        int m = time % 100;
        return h * 60 + m;
    }

    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;

        for (int i = 0; i < schedules.length; i++) {
            // 출근 희망 시간에 10분 더해서 제한 시간을 분 단위로
            int limit = timeToMinutes(schedules[i]) + 10;
            boolean success = true;

            for (int j = 0; j < 7; j++) {
                // 요일 계산 로직
                int currentDay = (startday + j - 1) % 7 + 1;

                /*
                 * 여기서 토요일(6), 일요일(7)이면 패스(continue)해야 되는데
                 * 그리고 timelogs[i][j] 기록도 timeToMinutes() 써서 분 단위로 바꾸고
                 * limit이랑 비교하는 if문을 써야 하는데,
                 * 중간에 한 번이라도 지각하면 어떻게 할지 처리하다가 오류..
                 */
            }

            if (success) {
                answer++;
            }
        }
        return answer;
    }
}