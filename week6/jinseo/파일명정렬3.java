package week6.jinseo;
import java.util.*;
public class 파일명정렬3 {

    public String[] solution(String[] files) {

        // Arrays.sort(대상, 규칙)
        Arrays.sort(files, (o1, o2) -> {

            // 숫자 이전 부분 저장
            String head1 = getHead(o1);
            String head2 = getHead(o2);

            // 숫자 부분 저장
            int num1 = getNumber(o1, head1.length());
            int num2 = getNumber(o2, head2.length());

            // HEAD 사전순 비교 (대소문자 무시)
            // (음수면 head1가 앞, 양수면 head2가 앞, 0은 같음)
            int headCompare = head1.compareToIgnoreCase(head2);
            if (headCompare != 0) {
                return headCompare;
            }

            // HEAD가 같다면 NUMBER 비교
            return Integer.compare(num1, num2);
        });

        return files;
    }


    private String getHead(String s){
        StringBuilder sb = new StringBuilder(); // String으로 할 경우 메모리 폭파
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // isDigit(ch) : ch가 숫자인걸 검사
            if (Character.isDigit(ch)) {
                break;
            }
            sb.append(ch);
        }
        return sb.toString();
    }


    private int getNumber(String file, int headLength) {
        StringBuilder sb = new StringBuilder();

        for (int i = headLength; i < file.length(); i++) {
            char ch = file.charAt(i);

            // 숫자이고, 길이가 5이하일 때만 추가
            if (Character.isDigit(ch) && sb.length() < 5) {
                sb.append(ch);
            } else {
                break;
            }
        }
        return Integer.parseInt(sb.toString());
    }
}