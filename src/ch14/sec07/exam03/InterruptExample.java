package ch14.sec07.exam03;

public class InterruptExample {
    public static void main(String[] args) {
        PrintThread thread = new PrintThread();
        thread.start();

        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){

        }

        thread.interrupt(); // 작업 스레드에 인터럽트

        System.out.println("메인 메소드의 스레드 이름: " + Thread.currentThread().getName());
    }
}
