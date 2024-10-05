package ch17.sec08;

import java.util.Arrays;

public class LoopingExample {
    public static void main(String[] args) {
        int[] ints = {1,2,3,4,5};

        // 잘못 작성된 코드
        Arrays.stream(ints)
                .filter(a -> a%2==0)
                .peek(n -> System.out.println(n)); // 작동 안함.

        int total = Arrays.stream(ints)
                .filter(a -> a%2==0)
                .sum();
        System.out.println("총합: " + total);

        Arrays.stream(ints)
                .filter(a -> a%2==0)
                .forEach(n -> System.out.println(n));


    }
}