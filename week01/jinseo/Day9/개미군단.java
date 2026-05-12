package Day9;

public class 개미군단 {
    public int solution(int hp) {

        return hp/5 + hp%5/3 + hp%5%3;
    }
}
