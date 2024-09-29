package ch15.sec03.exam03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("Java");
        set.add("Jdbc");
        set.add("Jsp");
        set.add("Spring");

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
            if(element.equals("Jsp")){
                iterator.remove();
            }
        }
        System.out.println();

        set.remove("Jdbc");

        for(String element : set){
            System.out.println(element);
        }
    }
}
