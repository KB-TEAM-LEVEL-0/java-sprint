class 피자나눠먹기 {
    public int solution(int n) {
        return getLCM(6, n)/6;
    }

    public int getLCM(int a, int b) {
        return (a * b) / getGCD(a, b);


    }
    public int getGCD(int a, int b) {
        if (b == 0) return a;
        return getGCD(b, a % b);
    }
}