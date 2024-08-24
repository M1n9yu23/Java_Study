package ch05.sec04;

public class GarbageObjectExample {
    public static void main(String[] args) {
        String hobby = "여행";
        hobby = null;

        String kind1 = "자동차";
        String kind2 = kind1; // kind1에 저장되어 있는 번지를 kind2에 대입
        kind1 = null;
        System.out.println("kind2 : " + kind2);
    }
}
