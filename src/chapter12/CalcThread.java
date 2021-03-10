package chapter12;

public class CalcThread extends Thread{
    public CalcThread(String name){
        setName(name);
    }

    @Override
    public void run() {
        int num =0;
        for(int i=0; i<1000000000; i++){

        }
        System.out.println(getName());
            try{
                Thread.sleep(500);
            } catch(Exception e){
                e.printStackTrace();
            }
    }
}
