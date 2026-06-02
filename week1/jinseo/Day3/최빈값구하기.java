package Day3;

public class 최빈값구하기 {
    public int solution(int[] array) {

        int max = 0;

        //최대값 찾기
        for(int i = 0; i < array.length; i++){

            if(max < array[i]){
                max = array[i];
            }
        }
        //최대값크기로 count 배열 만들기
        int[] count = new int[max+1];

        for(int j = 0; j < array.length; j++){
            count[array[j]]++;
        }
        // [ 0,1,1,3,1 ]

        int counter = 0;
        int index = 0;

        //제일 카운트 많이 된수 구하기
        for(int k = 0; k < count.length; k++){

            if(counter < count[k]) {
                counter = count[k];
                index = k;
            }
        }

        int winner = 0;
        for (int l = 0; l < count.length; l++){
            if (counter == count[l]){
                winner++;
            }
        }

        if (winner >1){
            return -1;
        }
        return index;


    }
}