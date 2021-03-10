package chapter12.CriticalSectionPractice;

public class Calculator {
    private int memory;

    public int getMemory(){
        return memory;
    }
    public synchronized void setMemory(int memory){ //계산기 메모리에 값을 저장하는 메소드 임계구역 o
        this.memory=memory; // 매개값을 memory 필드에 저장
        try{
            Thread.sleep(5000);
        }catch(Exception e){}
        System.out.println(Thread.currentThread().getName() + " : " + this.memory);
        
    }
//    public void setMemory(int memory){ //계산기 메모리에 값을 저장하는 메소드 임계구역x
//        this.memory=memory; // 매개값을 memory 필드에 저장
//        try{
//            Thread.sleep(5000);
//        }catch(Exception e){}
//        System.out.println(Thread.currentThread().getName() + " : " + this.memory);
//    }
}
