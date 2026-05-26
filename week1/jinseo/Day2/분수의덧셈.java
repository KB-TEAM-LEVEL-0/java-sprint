package Day2;

public class 분수의덧셈 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {

        int totalNumer = numer1*denom2+numer2*denom1;
        int totalDenom = denom1*denom2;

        int gcd = getGCD(totalNumer, totalDenom);//최대공약수

        int[] answer = {totalNumer/gcd, totalDenom/gcd};
        return answer;
    }

    //유클리드 호제법
    public int getGCD(int a, int b){
        while(b != 0){
            int x = a % b;
            a = b;
            b = x;
        }
        return a;
    }
}
