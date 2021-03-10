package chapter12;

import java.awt.*;

public class BeepThread extends Thread{
    public BeepThread() {
        setName("king");
    }
    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for(int i=0; i<5; i++){
            System.out.println(getName());
            toolkit.beep();
            try{
                Thread.sleep(500);
            } catch(Exception e) {}
        }
    }
}
