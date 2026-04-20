package Day7;

public class 특정문자제거하기 {
    public String solution(String my_string, String letter) {
        return my_string.replace(letter, "");
        //replace(a, b) : a를 b로 바꿈
    }
}
