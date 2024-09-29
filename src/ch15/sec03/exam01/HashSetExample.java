package ch15.sec03.exam01;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("Jdbc");
        set.add("Jsp");
        set.add("Java");
        set.add("Spring");

        int size = set.size();
        System.out.println("총 객체 수: " + size);

        for(String str : set){
            System.out.print(str + " ");
        }
    }
}
