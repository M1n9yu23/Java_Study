package ch17.sec06.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapExample {
    public static void main(String[] args) {
        int[] ints = {1,2,3,4,5};

        IntStream intStream = Arrays.stream(ints);
        intStream.asDoubleStream().forEach(i -> System.out.println(i));
        // 정수 스트림을 실수 스트림으로 변환

        // intStream.forEach(i -> System.out.println(i));
        // 스트림을 재사용 못함.

        System.out.println();

        // 사용한 스트림을 다시 사용하기 위해 스트림을 다시 얻음.
        intStream = Arrays.stream(ints);
        intStream.boxed().forEach(obj -> System.out.println(obj.intValue()));
        // 기본타입 스트림을 참조타입 스트림으로 변환 즉 기본 스트림 -> 래퍼 스트림

    }
}