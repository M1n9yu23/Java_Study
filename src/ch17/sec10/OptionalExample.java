package ch17.sec10;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // 요소가 없기 때문에 오류 발생
        /*
        double avg = list.stream()
                .mapToInt(Integer :: intValue)
                .average()
                .getAsDouble();
        */

        OptionalDouble optional = list.stream()
                .mapToInt(Integer :: intValue)
                .average();

        if (optional.isPresent())
            System.out.println("방법1 평균 : " + optional.getAsDouble());
        else{
            System.out.println("방법1 평균 : 0.0");
        }

        double avg = list.stream()
                .mapToInt(Integer :: intValue)
                .average()
                .orElse(0.0); // 집계값 없을 경우 0.0으로 정해놓음.
        System.out.println("방법2 평균 : " + avg);

        list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(a -> System.out.println("방법3 평균 : " + a));




    }
}
