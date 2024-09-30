package ch15.sec07;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());
        // 동기화된 HashMap을 생성

        Thread threadA = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    // Map에 1000개 객체를 넣음
                    // 즉, 엔트리 1000개
                    map.put(i, "내용" + i);
                }
            }
        };
        Thread threadB = new Thread() {
            @Override
            public void run() {
                for (int i = 1000; i < 2000; i++) {
                    map.put(i, "내용" + i);
                }
            }
        };

        threadA.start();
        threadB.start();

        try{
            threadA.join();
            threadB.join();
        } catch(Exception e){

        }

        int size = map.size();
        System.out.println("총 엔트리 객체 수: " + size);
        System.out.println();
        System.out.println(map.get(1200));
    }
}
