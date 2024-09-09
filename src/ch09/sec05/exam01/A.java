package ch09.sec05.exam01;

public class A {
    int field1;
    void method1(){}

    static int field2;
    static void method2(){}

    class B{
        void method(){
            field1 = 10;
            method1();

            field2 = 10;
            method2();
        }
    }

    static class C{
        void method(){
            // A의 인스턴스 필드와 메소드 사용못함. 객체가 생성되어야 사용할 수 있기 때문에

            // A의 정적 필드와 메소드
            field2 = 10;
            method2();
        }
    }
}
