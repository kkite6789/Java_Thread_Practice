package chapter12;

public class Thread1 extends Thread{
    public Thread1(){
        setName("hi");
    }

    @Override
    public void run() {
        for(int i=0; i<2; i++){
            System.out.println(getName());
        }
    }
}
