package ch09.sec05.exam02;

public class A {
    String field = "A 필드";

    void method() {
        System.out.println("A 메소드");
    }

    class B {
        String field = "B 필드";

        void method() {
            System.out.println("B 메소드");
        }

        void print() {
            System.out.println(this.field);
            this.method();

            System.out.println(A.this.field);
            A.this.method();
        }
    }

    void useB() {
        B b = new B();
        b.print();
    }
}
