package ch14.sec05.exam02;

public class JoinExample {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();
        try{
            sumThread.join();
        } catch(InterruptedException e){

        }
        System.out.println("1~100 합: " + sumThread.getSum());
        // join 메소드를 주석 처리 하면 0만 나오는 이유
        // sumThread의 계산이 아직 완료되지 않았으므로, getSum() 메소드가 반환하는 값은 기본값인 0입니다.
    }
}