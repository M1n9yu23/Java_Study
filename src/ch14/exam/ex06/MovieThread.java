package ch14.exam.ex06;

public class MovieThread extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("동영상을 재생합니다.");

            /*
            if(this.isInterrupted()){
                break;
            }*/
/*
            try{
                Thread.sleep(1);
            } catch(InterruptedException e) {

            }*/
            if(Thread.interrupted()){
                System.out.println(Thread.currentThread().getName() + " 스레드 종료");
                break;
            }
        }
    }
}
