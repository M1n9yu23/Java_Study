package ch14.sec08;

public class AutoSaveThread implements Runnable{
    public void Save(){
        System.out.println("작업 내용을 저장함");
    }

    @Override
    public void run(){
        while(true){
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e){
                break;
            }
            Save();
        }
    }
}
