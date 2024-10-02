package ch17.sec02;

import java.util.*;
import java.util.stream.Stream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("홍길동");
        list.add("신용권");
        list.add("김자바");
        list.add("람다식");
        list.add("병렬");

        Stream<String> parallelStream = list.parallelStream(); // 병렬 스트림 객체 얻기
        parallelStream.forEach(name -> {
            System.out.println(name + ": " + Thread.currentThread().getName());
        });

        
        // map 스트림 연습
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"잘하고싶다.");
        map.put(2,"노력하면될까");
        map.put(3, "해야지...");


        Stream<Map.Entry<Integer,String>> mapStream = map.entrySet().parallelStream();
        mapStream.forEach((entry) -> {
            System.out.println(entry.getKey() + ": " + entry.getValue() + "  "+Thread.currentThread().getName());
        });
    }
}
