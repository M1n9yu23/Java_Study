package ch12.exam.ex08;

public class Example08 {
    public static void main(String[] args) {

        long time1 = System.nanoTime();
        int[] scores = new int[100];
        for(int i = 0; i < scores.length; i++){
            scores[i] = i;
        }

        int sum = 0;
        for(int score : scores){
            sum += score;
        }

        double avg = sum / scores.length;
        System.out.println(avg);

        long time2 = System.nanoTime();

        System.out.println("걸린 시간: " + (time2 - time1));
    }
}
