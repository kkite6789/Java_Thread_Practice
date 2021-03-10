package chapter12;

public class PriorityExample2 {
    public static void main(String[] args) {
        PriorityExample2 pe = new PriorityExample2();
    }
    public PriorityExample2() {
        MyThread t1 = new MyThread("FirstThread");
        MyThread t2 = new MyThread("SecondThread");
        MyThread t3 = new MyThread("ThirdThread");
        MyThread t4 = new MyThread("fourthThread");
        MyThread t5 = new MyThread("fifthThread");
        t1.setPriority(10);
        t2.setPriority(7);
        t3.setPriority(4);
        t4.setPriority(2);
        t5.setPriority(1);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        System.out.println("FirstThread : " + t1.getPriority());
        System.out.println("SecondThread : " + t2.getPriority());
        System.out.println("ThirdThread : " + t3.getPriority());
        System.out.println("ThirdThread : " + t4.getPriority());
        System.out.println("ThirdThread : " + t5.getPriority());
    }

    static class MyThread extends Thread {

        String name;

        MyThread(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            int num = 0;
            for(int i=0; i<10000000; i++) {
            }
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {}

        }
    }
}
