package ch13.sec03.exam01;

public class GenericExample {
    public static void main(String[] args) {
        Box<Integer> box1 = boxing(100);
        int intValue = box1.get();
        System.out.println(intValue);

        Box<String> box2 = boxing("안녕하세요");
        String str = box2.get();
        System.out.println(str);
    }

    public static <T> Box<T> boxing(T t){
        Box<T> box = new Box<>();
        box.set(t);
        return box;
    }
}
