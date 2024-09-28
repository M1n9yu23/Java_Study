package ch14.sec06.exam01;

public class Calculator {
    private int memory;

    public int getMemory(){
        return memory;
    }

    public synchronized void setMemory1(int memory){ // 동기화 메소드
        this.memory = memory;
        try{
            Thread.sleep(2000);
        } catch(InterruptedException e){
        }
        System.out.println(Thread.currentThread().getName() + ": " + this.memory);
        // 현재 실행 중인 쓰레드의 객체를 리턴해서 이름을 출력 / 현재 객체의 메모리 값 출력
    }

    public void setMemory2(int memory){
        synchronized (this){ // 동기화 블록 (현재 객체)
            this.memory = memory;
            try{
                Thread.sleep(2000);
            } catch(InterruptedException e){

            }
            System.out.println(Thread.currentThread().getName() + ": " + this.memory);
        }
    }
}
