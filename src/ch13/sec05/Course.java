package ch13.sec05;

public class Course {
    public static void registerCourse1(Applicant<?> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName()+"이(가) 코스1을 등록함");
    }

    public static void registerCourse2(Applicant<? extends Student> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName()+"이(가) 코스2를 등록함.");
    }

    public static void registerCourse3(Applicant<? super Worker> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName()+"이(가) 코스3을 등록함.");
    }
}
