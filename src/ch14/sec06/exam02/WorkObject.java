package ch14.sec06.exam02;

public class WorkObject {
    public synchronized void methodA(){ // 동기화 메소드
        Thread thread = Thread.currentThread(); // 현재 스레드 객체 리턴
        System.out.println(thread.getName() + ": methodA 작업 실행");
        notify(); // wait로 일시정지 된 스레드 한개를 실행대기로 만듬
        try{
            wait();
        } catch(InterruptedException e){

        }
    }

    public synchronized void methodB(){
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + ": methodB 작업 실행");
        notify();
        try{
            wait();
        } catch(InterruptedException e){

        }
    }
}