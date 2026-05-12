package main.java.ch08_multi_thread.thread.ex2;

public class SleepThreadRun {
    public static void main(String[] args) {
        Thread SleepThread = new Thread(new SleepThread());
//        SleepThread sleepThread = new SleepThread();
        SleepThread.start();
        // -> SleepThread의 run() 메서드 실행
    }

}
