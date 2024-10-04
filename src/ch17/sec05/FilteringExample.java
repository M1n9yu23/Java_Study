package ch17.sec05;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("신용권");
        list.add("감자바");
        list.add("신용권");
        list.add("신민철");

        list.stream().distinct().forEach(n -> {
            System.out.println(n);
        }); // 리스트를 스트림으로 가져와서 중복을 제거하고 새로운 스트림을 생성하여 요소 처리방법인 foreach에 람다식을 작성해줌.

        System.out.println();

        list.stream()
                .filter(n -> n.startsWith("신"))
                .forEach(n -> System.out.println(n));
        // 리스트를 스트림으로 가져와서 필터는 매개값을 람다로 전달해야함(startsWith는 주어진 문자열로 시작하면 true를 반환).
        // "신"인 요소만 뽑아서 새로운 스트림을 생성하여 요소 처리방법인 foreach에 람다식을 제공
        System.out.println();

        list.stream()
                .distinct()
                .filter(n -> n.startsWith("신"))
                .forEach(n -> System.out.println(n));
    }
}
