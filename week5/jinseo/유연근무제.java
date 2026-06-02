package week5.jinseo;

public class 유연근무제 {
    public int solution(int[] schedules, int[][] timelogs, int startday) {

        int sucEmpCount = 0;

        for (int i = 0; i < schedules.length; i++) {
            int targetTime = schedules[i];

            int hour = targetTime / 100;
            int minute = (targetTime % 100) + 10;

            if (minute >= 60) {
                hour += 1;
                minute -= 60;
            }

            int lastTime = hour * 100 + minute;

            boolean countIf = true;

            for (int j = 0; j < 7; j++) {
                int crt = (startday + j - 1) % 7 + 1;

                if (crt == 6 || crt == 7) {
                    continue;
                }

                if (timelogs[i][j] > lastTime) {
                    countIf = false;
                    break;
                }
            }

            if (countIf) {
                sucEmpCount++;
            }
        }

        return sucEmpCount;
    }
}