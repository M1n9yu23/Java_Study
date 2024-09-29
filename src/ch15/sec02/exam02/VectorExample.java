package ch15.sec02.exam02;

import ch15.sec02.exam01.Board;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        List<Board> list = new Vector<>();

        Thread threadA =new Thread(){
            @Override
            public void run(){
                for(int i = 1; i<=1000; i++){
                    list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
                }
            }
        };
        threadA.start();
        Thread threadB = new Thread(){
            @Override
            public void run(){
                for(int i = 1001; i<=2000; i++){
                    list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
                } // 벡터는 동기화 메소드이기 때문에 threadA가 실행이 다 끝나야 threadB가 실행 됨
            }
        };
        threadB.start();
        try{
            threadA.join(); // main thread는 threadA가 종료 될 때까지 기다림
            threadB.join(); // main thread는 threadB가 종료 될 때까지 기다림
        } catch(Exception e){

        }

        int size = list.size();
        System.out.println("총 객체 수: " + size);
        System.out.println();
    }
}
