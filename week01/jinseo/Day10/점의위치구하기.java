package Day10;

public class 점의위치구하기 {

    public int solution(int[] dot) {

        int loca = dot[0]*dot[1];

        if (loca < 0){
            if (dot[0] <0){
                return 2;
            }else {
                return 4;
            }
        } else {
            if (dot[0] < 0){
                return 3;
            }else {
                return 1;
            }
        }

    }

}
