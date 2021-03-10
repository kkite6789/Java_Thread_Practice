package chapter12;
import java.awt.*;
import java.lang.*; // java.lang.Thread;

public class MultiThreadBasic {

    public static class BeepTask implements Runnable {
        @Override
        public void run() {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            for (int i = 0; i < 5; i++) {
                toolkit.beep();
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        }
    }
    public static void main(String[] args) {
        Runnable beepTask = new BeepTask();
        Thread thread = new Thread(beepTask);
        thread.start();

        for(int i=0; i<5; i++){ System.out.println("띵");
            try{
                thread.sleep(500);
            } catch(Exception e) {}
        }
    }
}

