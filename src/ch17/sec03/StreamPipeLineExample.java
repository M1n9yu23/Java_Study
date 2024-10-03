package ch17.sec03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("홍길동", 10));
        list.add(new Student("신용권", 20));
        list.add(new Student("유미선", 30));

        Stream<Student> studentStream = list.stream();
        // 각 요소인 학생들을 그 학생의 점수로 매핑/ 매핑 중간 스트림.
        IntStream scoreStream = studentStream.mapToInt(student -> {
            return student.getScore();
        });
        // 요소들의 총 점수로 평균을 냄. 최종 처리
        double avg = scoreStream.average().getAsDouble();
        System.out.println("평균 점수: " + avg);

        avg = list.stream().mapToInt(student-> student.getScore()).average().getAsDouble();
        System.out.println("평균 점수: " + avg);

    }
}
