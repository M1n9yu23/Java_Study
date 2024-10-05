package ch17.sec11;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("홍길동", 92),
                new Student("신용권", 95),
                new Student("감자바", 88)
        );

        int sum1 = students.stream()
                .mapToInt(Student::getScore)
                .sum();

        int sum2 = students.stream()
                .map(Student::getScore)
                .reduce(0, (a,b) -> {
                    System.out.println(a + " + " + b);
                    // 0 + 92
                    // 92 + 95
                    // 187 + 88
                    return a+b;
                });
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
