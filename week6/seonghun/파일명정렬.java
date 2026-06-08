package week6.seonghun;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class 파일명정 {
    public String[] solution(String[] files) {
        // 숫자가 처음 등장하는 부분을 기준으로 분리하기 위한 정규식 패턴
        Pattern pattern = Pattern.compile("([a-zA-Z -.]+)([0-9]{1,5})");

        Arrays.sort(files, (f1, f2) -> {
            Matcher m1 = pattern.matcher(f1);
            Matcher m2 = pattern.matcher(f2);

            if (m1.find() && m2.find()) {
                String head1 = m1.group(1).toLowerCase();
                String head2 = m2.group(1).toLowerCase();
                int headCompare = head1.compareTo(head2);

                if (headCompare != 0) {
                    return headCompare;
                }

                int num1 = Integer.parseInt(m1.group(2));
                int num2 = Integer.parseInt(m2.group(2));

                return Integer.compare(num1, num2);
            }

            return 0;
        });

        return files;
    }
}