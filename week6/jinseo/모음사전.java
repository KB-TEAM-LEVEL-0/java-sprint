package week6.jinseo;

import java.util.ArrayList;
import java.util.List;

public class 모음사전 {
    static String[] vowels = {"", "A", "E", "I", "O", "U"};


    public int solution(String word) {

        List<String> list = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                for (int k = 0; k <= 5; k++) {
                    for (int l = 0; l <= 5; l++) {
                        for (int m = 0; m <= 5; m++) {

                            String str = vowels[i] + vowels[j] + vowels[k] + vowels[l] + vowels[m];

                            if (isValid(vowels[i], vowels[j], vowels[k], vowels[l], vowels[m])) { //사이에 빈칸 있는지 검사
                                list.add(str);
                            }
                        }
                    }
                }
            }
        }

        // 찾을 단어의 순서값 반환
        return list.indexOf(word) + 1;
    }

    private boolean isValid(String v1, String v2, String v3, String v4, String v5) {
        if (v2.equals("") && (!v3.equals("") || !v4.equals("") || !v5.equals(""))) return false;
        if (v3.equals("") && (!v4.equals("") || !v5.equals(""))) return false;
        if (v4.equals("") && !v5.equals("")) return false;
        return true;
    }
}
