package ch13.exam.ex04;

public class Util {

   /* public static <K, V> V getValue(Pair<K,V> p , K key ){
        if(p.getKey().equals(key)){
            return p.getValue();
        }

        return null;
    }*/

    // P는 Pair 클래스 또는 하위클래스만. 그리고 , 이것으로 다른 제네릭을 구분함
    // 즉 <P, K, V> 이렇게 선언됐다고 볼 수 있음.
    public static <P extends Pair<K,V>,K,V> V getValue(P p, K k){
        if(p.getKey().equals(k)){
            return p.getValue();
        }

        return null;
    }
}
