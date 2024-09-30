package ch15.sec08;

import java.util.*;

public class ImmutableExample {
    public static void main(String[] args) {
        List<String> immutableList1 = List.of("A", "B", "C");
        // 추가 삭제 안됨.

        Set<String> immutableSet1 = Set.of("A", "B", "C");
        // 추가 삭제 안됨.

        Map<Integer, String> immutableMap1 = Map.of(1, "A", 2, "B", 3, "C");
        // 추가 삭제 안됨.

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        List<String> immutableList2 = List.copyOf(list);
        // list 객체를 복사해서 불변으로 만든 후 리턴.
        // list와 immutableList2는 서로 다른 객체를 참조하고 있음
        // 그래서 복사 한 후에 list 참조변수로 추가 삭제를 하여도 반영 X

        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        Set<String> immutableSet2 = Set.copyOf(set);
        // set 객체를 복사해서 불변으로 만든 후 리턴

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        Map<Integer,String> immutableMap2 = Map.copyOf(map);
        // map 객체를 복사해서 불변으로 만든 후 리턴

        // 배열로부터 불변 컬렉션 생성
        String[] arr = {"A","B","C"};
        List<String> immutableList3 = Arrays.asList(arr);

    }
}
