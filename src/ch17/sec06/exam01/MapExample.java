package ch17.sec06.exam01;

import java.util.ArrayList;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("홍길동", 85));
        students.add(new Student("홍길동", 95));
        students.add(new Student("홍길동", 87));

        students.stream()
                .mapToInt(s -> s.getScore())// 요소 객체 즉, student를 매개값으로 받아서 그 객체의 score 값으로 매핑시킴.
                .forEach(score -> System.out.println(score));
    }
}