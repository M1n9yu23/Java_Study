package ch17.sec06.exam03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("this is java");
        list1.add("i am a best developer");
        list1.stream()
                .flatMap(data -> Arrays.stream(data.split(" "))) // function<data,Stream<String>> 요소 data -> Stream<String>으로 변환
                .forEach(word -> System.out.println(word));


        System.out.println();

        List<String> list2 = Arrays.asList("10, 20 , 30", "40, 50");
        list2.stream()
                .flatMapToInt(data -> {
                    String[] strArr = data.split(",");
                    int[] intArr = new int[strArr.length];
                    for(int i = 0; i < intArr.length; i++){
                        intArr[i] = Integer.parseInt(strArr[i].trim()); // trim은 공백 제거 메소드임.
                    }
                    return Arrays.stream(intArr);
                })
                .forEach(number -> System.out.println(number));
    }
}
