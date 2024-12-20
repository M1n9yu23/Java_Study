package ch16.exam.ex08;

public class Example {
    private static Student[] students = {
            new Student("홍길동", 90, 96),
            new Student("신용권", 95,93)
    };

    public static double avg(Function<Student> function){
        int sum = 0;
        for(Student s : students){
            sum += function.apply(s);
        }
        double avg = (double) sum / students.length;
        return avg;
    }

    public static void main(String[] args) {
        double englishAvg = avg(s -> {
            return s.getEnglishScore();
        });
        System.out.println("영어 평균 점수: " + englishAvg);

        englishAvg = avg(Student :: getEnglishScore);

        System.out.println("영어 평균 점수: " + englishAvg);

        double mathAvg = avg(s ->{
            return s.getMathScore();
        });

        System.out.println("수학 평균 점수: " + mathAvg);

        mathAvg = avg(Student :: getMathScore);

        System.out.println("수학 평균 점수: " + mathAvg);
    }
}
