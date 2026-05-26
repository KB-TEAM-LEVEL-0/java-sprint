public class 분수의덧셈 {
        public int[] solution(int numer1, int denom1, int numer2, int denom2) {
            int numer =numer2*denom1+numer1*denom2;
            int denom = denom1*denom2;
            for (int i=1; numer<=i && denom<=i;i++){
                if (numer%i ==0&&denom%i ==0){
                    numer = numer /i;
                    denom = denom /i;
                }}
            int[] answer = {numer, denom};
            return answer;
        }
    }

