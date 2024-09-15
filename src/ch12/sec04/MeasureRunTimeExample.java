package ch12.sec04;

public class MeasureRunTimeExample {

  public static void main(String[] args) {
    long time1 = System.nanoTime();
    int sum = 0;
    for(int i = 0; i < 1000000; i++){
      sum += i;
    }

    long time2 = System.nanoTime();
    System.out.println("sum: " + sum);
    System.out.println("계산처리에 " + (time2-time1) + "나노초가 소요되었습니다.");


  }

}