package ch08.sec11.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.run();

        System.out.println("타이어를 교체합니다.");

        myCar.tire1 = new KumhoTire();
        myCar.tire2 = new KumhoTire();

        myCar.run();
    }
}
