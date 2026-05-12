package assignment.ch04.sec02;

public class IfElseIfElseExample {
    public static void main(String[] args) {
        int score = 75;

        if(score > 0 && score <= 69) {
            System.out.println("점수가 0~69 입니다.");
            System.out.println("등급은 D입니다.");
        } else if (score > 69 && score <= 79) {
            System.out.println("점수가 70~79 입니다.");
            System.out.println("등급은 C입니다.");
        } else if (score > 79 && score <= 89) {
            System.out.println("점수가 80~89 입니다.");
            System.out.println("등급은 B입니다.");
        } else if (score > 89 && score <= 100) {
            System.out.println("점수가 90~100 입니다.");
            System.out.println("등급은 A입니다.");
        }
    }
}
