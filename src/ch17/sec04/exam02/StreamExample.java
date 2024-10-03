package ch17.sec04.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        String[] str = { "홍길동", "신용권", "최미나"};
        Stream<String> stringStream = Arrays.stream(str); // 배열로부터 스트림을 얻음.
        stringStream.forEach(name -> {
            System.out.print(name + ", ");
        });

        System.out.println();
        int[] ints = {1,2,3,4,5};
        IntStream intStream = Arrays.stream(ints); // 배열로부터 스트림을 얻음.
        intStream.forEach(i -> {
            System.out.print(i + ", ");
        });
        System.out.println();

    }
}
