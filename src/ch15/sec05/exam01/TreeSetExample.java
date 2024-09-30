package ch15.sec05.exam01;

import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);

        for(Integer s : scores){
            System.out.print(s + " ");
        }
        System.out.println("\n");

        System.out.println("가장 낮은 점수: " + scores.first());
        System.out.println("가장 높은 점수: " + scores.last());
        System.out.println("95점 아래 점수: " + scores.lower(95));
        System.out.println("95점 위의 점수: " + scores.higher(95));
        System.out.println("95점이거나 바로 아래 점수: " + scores.floor(95));
        System.out.println("85점이거나 바로 위의 점수: " + scores.ceiling(85) + "\n");

        NavigableSet<Integer> descendingScores = scores.descendingSet();
        for(Integer s : descendingScores){
            System.out.print(s + " ");
        }
        System.out.println("\n");

        // 80 <= 객체들을 리턴
        NavigableSet<Integer> rangeSet = scores.tailSet(80, true);
        for(Integer s : rangeSet){
            System.out.print(s + " ");
        }
        System.out.println("\n");

        // 80 <= score < 90
        rangeSet = scores.subSet(80, true, 90, false);
        for(Integer s : rangeSet){
            System.out.print(s + " ");
        }
        System.out.println("\n");

        Iterator<Integer> scoreIterator = scores.descendingIterator();
        // Iterator 는 Iterable 상속 관계가 아니기 때문에 for each 안됨.
        // for each 는 Iterable 상속 관계인 인터페이스나 클래스만 가능. list set 은 collection 상속 관계
        while(scoreIterator.hasNext()){
            Integer s = scoreIterator.next();
            System.out.print(s + " ");
        }
    }
}
