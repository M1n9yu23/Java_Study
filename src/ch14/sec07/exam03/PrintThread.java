package ch14.sec07.exam03;

public class PrintThread extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("실행 중");
            /*if(Thread.interrupted()){
                break;
            }*/
            if(Thread.currentThread().isInterrupted()){ // 현재 작업 스레드의 객체를 리턴 받아서 이 스레드가 인터럽트 호출이 되었는지 확인.
                System.out.println("작업 스레드 이름: " + Thread.currentThread().getName());
                break;
            }
        }
        System.out.println("리소스 정리");
        System.out.println("실행 종료");
    }
}
