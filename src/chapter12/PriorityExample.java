package chapter12;

public class PriorityExample {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++) {
            Thread thread = new CalcThread("thread" +   i);
            if (i == 2) {
                thread.setPriority(5);
                System.out.println("우선순위 : " + thread.getPriority() + " <-- " + i + " 번 째 thread");

            } else if(i == 5){
                thread.setPriority(10);
                System.out.println("우선순위 : " + thread.getPriority() + " <-- " + i + " 번 째 thread");
            } else{
                thread.setPriority(1);
                System.out.println("우선순위 : " + thread.getPriority() + " <-- " + i + " 번 째 thread");
            }
            thread.start();
        }
    }
}
