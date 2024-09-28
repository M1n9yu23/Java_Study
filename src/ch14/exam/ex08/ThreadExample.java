package ch14.exam.ex08;

import ch14.exam.ex06.MovieThread;

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread = new MovieThread();
        thread.setDaemon(true);
        thread.start();

        try{
            Thread.sleep(3000);
        } catch(InterruptedException e){

        }
    }
}
