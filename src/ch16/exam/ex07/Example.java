package ch16.exam.ex07;

public class Example {
    private static int[] scores = {10, 50, 3};
    public static int maxOrMin(Operator operator){
        int result = scores[0];
        for(int score : scores){
            result = operator.apply(result, score);
        }
        return result;
    }

    public static void main(String[] args) {
        int max = maxOrMin((x,y)->{
            if(x < y){
                return y;
            }
            return x;
        });

        System.out.println("최대값: " + max);

        int min = maxOrMin((x,y) ->{
            if(x < y){
                return x;
            }
            return y;
        });
        System.out.println("최소값: " + min);
    }

}
