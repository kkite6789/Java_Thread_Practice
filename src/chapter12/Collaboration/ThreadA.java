package chapter12.Collaboration;

public class ThreadA extends Thread{
    private WorkObject workObject;

    public ThreadA(WorkObject workobject){
        this.workObject = workobject;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            workObject.methodA();
        }
    }
}
