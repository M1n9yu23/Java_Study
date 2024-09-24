package ch13.sec04;

public class GenericExample {
    public static void main(String[] args) {
        boolean result1 = compare(10,20);
        System.out.println(result1);
        System.out.println();

        boolean result2 = compare(4.5, 4.5);
        System.out.println(result2);
    }

    public static <T extends Number> boolean compare(T t1, T t2){
        System.out.println("compare(" + t1.getClass().getSimpleName() + ", " + t2.getClass().getSimpleName() + ")");


        // 이렇게 수정하면 값이 같아도 false 나오는 이유는 Number의 하위 타입인 Integer 나 Double 클래스의 == 연산자는 메모리 주소를 비교하기 때문임
        // 그래서 double 기본 타입으로 변형해서 == 비교를 한 것
        // 즉 equals 메소드를 사용하면 가능함.
        /*double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();

        return (v1 == v2);*/

        T v1 = t1;
        T v2 = t2;

        return v1.equals(v2);
    }
}
