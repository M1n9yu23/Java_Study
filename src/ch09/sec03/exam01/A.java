package ch09.sec03.exam01;

public class A {
    static class B {
        int field = 1;

        static int field2 = 2;

        B(){
            System.out.println("B 생성자 실행");
        }

        void method1(){
            System.out.println("B 메소드1 실행");
        }

        static void method2(){
            System.out.println("B 메소드2 실행");
        }
    }

    B field = new B();

    static B field2 = new B();

    A() {
        B b = new B();
    }

    void method1() {
        B b = new B();
    }

    static void method2() {
        B b = new B();
    }

}
