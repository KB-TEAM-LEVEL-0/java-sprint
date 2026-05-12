package Day8;

public class 외계행성의나이 {
    public String solution(int age) {
        String answer = "";


        String[] ageList = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

        int age1000 = (age / 1000) % 10;
        int age100 = (age / 100) % 10;
        int age10 = (age / 10) % 10;
        int age1 = age % 10;

        if(age >999) {
            answer = ageList[age1000]+ageList[age100]+ageList[age10]+ageList[age1];
        } else if(age > 99) {
            answer = ageList[age100]+ageList[age10]+ageList[age1];
        } else if(age > 9) {
            answer = ageList[age10] + ageList[age1];
        } else {
            answer = ageList[age1];
        }

        return answer;
    }
}
