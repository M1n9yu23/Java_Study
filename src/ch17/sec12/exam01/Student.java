package ch17.sec12.exam01;

public class Student {
    private String name;
    private int score;
    private String sex;

    public Student(String name, String sex,int score){
        this.name = name;
        this.sex = sex;
        this.score = score;
    }

    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }
    public String getSex(){
        return sex;
    }
}
