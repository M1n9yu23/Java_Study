package ch15.exam.ex09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("blue",96);
        map.put("hong",86);
        map.put("white",92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        Set<Map.Entry<String, Integer>> set = map.entrySet();
        for(Map.Entry<String, Integer> entry : set){
            totalScore += entry.getValue();
            if(entry.getValue() > maxScore){
                maxScore = entry.getValue();
                name = entry.getKey();
            }
        }
        System.out.printf("평균 점수: %d\n", totalScore/map.size() );
        System.out.println("최고 점수: " + maxScore);
        System.out.println("최고 점수를 받은 아이디: " + name);
    }
}
