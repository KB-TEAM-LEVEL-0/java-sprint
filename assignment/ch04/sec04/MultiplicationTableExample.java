package assignment.ch04.sec04;

public class MultiplicationTableExample {
    public static void main(String[] args) {
        for(int i = 2; i < 10; i++) {
            System.out.printf(" *** %d 단 ***", i);
            System.out.println();
            for(int j = 1; j < 10 ; j++) {
                System.out.printf(" %d X %d = %d", i, j, j*i);
                System.out.println();
            }
        }

    }
}
