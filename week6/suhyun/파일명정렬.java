import java.util.Arrays;

class 파일명정렬 {
    public String[] solution(String[] files) {

        // 이전 문제처럼 Arrays.sort와 람다식을 활용해서 정렬 기준 정의
        Arrays.sort(files, (f1, f2) -> {
            // 1. 각 파일명에서 HEAD 부분만 추출
            String head1 = getHead(f1);
            String head2 = getHead(f2);

            // 대소문자 구분 없이 HEAD 비교 (양수/음수가 나오면 그 순서대로 정렬)
            int headCompare = head1.compareToIgnoreCase(head2);
            if (headCompare != 0) {
                return headCompare;
            }

            // 2. HEAD가 같다면 NUMBER 부분을 숫자로 바꿔서 비교
            int num1 = getNumber(f1, head1.length());
            int num2 = getNumber(f2, head2.length());

            return num1 - num2; // 오름차순 정렬

            // 3. HEAD와 NUMBER가 모두 같다면 원래 순서 유지 (Arrays.sort가 알아서 보장해줌)
        });

        return files;
    }

    // 파일명에서 문자가 끝나고 숫자가 나오기 전까지(HEAD) 잘라내는 함수
    private String getHead(String file) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < file.length(); i++) {
            char ch = file.charAt(i);
            if (Character.isDigit(ch)) {
                break; // 숫자가 나오는 순간 HEAD 추출 종료
            }
            sb.append(ch);
        }
        return sb.toString();
    }

    // HEAD가 끝난 지점부터 시작해서 최대 5글자의 숫자(NUMBER)를 추출하는 함수
    private int getNumber(String file, int startIdx) {
        StringBuilder sb = new StringBuilder();
        for (int i = startIdx; i < file.length(); i++) {
            char ch = file.charAt(i);
            // 연속된 숫자이면서 최대 5글자까지만 인정
            if (Character.isDigit(ch) && sb.length() < 5) {
                sb.append(ch);
            } else {
                break;
            }
        }
        return Integer.parseInt(sb.toString()); // "00012" 같은 문자열도 정수 12로 변환됨
    }
}