package ch15.sec05.exam04;

import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {
        TreeSet<Fruit> treeSet = new TreeSet<>(new FruitComparator());
        // 생성자에 비교자를 줌
        treeSet.add(new Fruit("포도",3000));
        treeSet.add(new Fruit("수박",10000));
        treeSet.add(new Fruit("딸기", 6000));

        for(Fruit f : treeSet){
            System.out.println(f.name + " " + f.price);
        }
    }
}