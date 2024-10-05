package ch17.sec12.exam02;

import ch17.sec12.exam01.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("홍길동","남",92));
        totalList.add(new Student("김수영","여",87));
        totalList.add(new Student("감자바","남",54));
        totalList.add(new Student("오해영","여",93));

        Map<String, List<Student>> map = totalList.stream()
                .collect(
                        Collectors.groupingBy(s -> s.getSex())
                );

        Set<Map.Entry<String,List<Student>>> set = map.entrySet();
        for (Map.Entry<String,List<Student>> entry : set){
            System.out.println(entry.getKey() + entry.getValue());
        }

        List<Student> maleList = map.get("남");
        maleList.stream().forEach(s -> System.out.println(s.getName()));
        System.out.println();

        List<Student> femaleList = map.get("여");
        femaleList.stream().forEach(s -> System.out.println(s.getName()));

    }
}
