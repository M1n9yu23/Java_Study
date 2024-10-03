package ch17.sec04.exam03;

import java.util.stream.IntStream;

public class StreamExample {
    public static int sum;

    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1,100); // 범위로부터 스트림을 얻음.
        stream.forEach(a -> {
            System.out.println(sum + "+" + a);
            sum += a; // 0 + 1, 1 + 2
        });

        System.out.println("총합: " + sum);
    }
}
