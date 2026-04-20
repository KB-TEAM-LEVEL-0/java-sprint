package Day6;

public class 문자반복출력하기 {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            //i번째 값 c에 담기

            for(int j= 0; j < n; j++){
                sb.append(c);
            }
        }
        return sb.toString();

//        문자열 코드
//        .append(값): 문자열 맨 뒤에 값을 이어 붙임
//
//        .insert(위치, 값): 원하는 위치(인덱스)에 끼워 넣기
//
//        .delete(시작, 끝): 원하는 구간의 글자를 지우기
//
//        .reverse(): 글자 순서를 통째로 뒤집기
//
//        .toString로 (): toString으로 바꾸기
    }
}
