package ch15.sec02.exam03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> list1 = new LinkedList<>();
        List<String> list2 = new ArrayList<>();

        long startTime;
        long endTime;

        startTime = System.nanoTime();
        for(int i = 0; i < 1000; i++){
            list2.add(0, String.valueOf(i)); // 인덱스 0에 계속 넣기 때문에 처음에 넣은 0은 뒤로 밀려남 인덱스 999에 0이 들어있음.
        }
        endTime = System.nanoTime();
        System.out.printf("ArrayList 걸린 시간: %8d ns \n", (endTime-startTime));
        System.out.println(list2.get(0));

        startTime = System.nanoTime();
        for(int i = 0; i<1000; i++){
            list1.add(0, String.valueOf(i)); // 인덱스 0에 계속 넣기 때문에 처음에 넣은 0은 뒤로 밀려남 인덱스 999에 0이 들어있음.
        }
        endTime = System.nanoTime();
        System.out.printf("LinkedList 걸린 시간: %8d ns \n", (endTime-startTime));

        System.out.println(list1.get(999));

    }
}