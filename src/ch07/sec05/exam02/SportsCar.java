package ch07.sec05.exam02;

public class SportsCar extends Car{
    @Override
    public void speedUp(){
        speed += 10; // 부모 필드 speed를 10 증가
    }

    /* final 키워드가 붙은 메소드는 오버라이딩 못함.
    @Override
    public void stop(){
        System.out.println("스포츠카를 멈춤");
        speed = 0;
    }*/
}
