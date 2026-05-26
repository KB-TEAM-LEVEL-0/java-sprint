package Day9;

import java.util.Arrays;

public class 모스부호 {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        String[] abc = new String[26];
        for (int i = 0; i < 26; i++) {
            abc[i] = String.valueOf((char)('a' + i));
            //('a' + i) (아스키코드 연산)
        }

        // 공백을 기준으로 모스부호를 하나씩 분리
        String[] splitLetter = letter.split(" ");

        for(int i = 0; i< splitLetter.length;i++) {
            for(int j =0; j < morse.length; j++) {
                if(splitLetter[i].equals(morse[j])){
                    splitLetter[i] = abc[j];
                }
            }
        }

        for(int i = 0; i < splitLetter.length; i++) {
            answer += splitLetter[i];
        }

        return answer;
    }
}
