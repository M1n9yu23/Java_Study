package ch17.sec07.exam01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("홍길동", 30));
        students.add(new Student("신용권", 10));
        students.add(new Student("유미선", 20));

        students.stream()
                .sorted()
                .forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));

        System.out.println();

        students.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(s -> System.out.println(s.getName() + ": "  + s.getScore()));
        // sec06 exam02에서 스트림을 사용하고 나서 다시 스트림 생성하는 이유는 스트림에 배열스트림을 넣어줘야하기 때문임.
        // 여기선 student리스트로 바로 스트림을 생성하는 것
    }
}
