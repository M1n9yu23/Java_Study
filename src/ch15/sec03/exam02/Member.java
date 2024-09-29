package ch15.sec03.exam02;

public class Member {
    public String name;
    public int age;

    public Member(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode(){
        return name.hashCode() + age; // name의 hashCode 메소드 리턴 값이랑 age를 플러스
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Member target){
            return target.name.equals(name) && target.age == age;
            // 매개값으로 받은 obj의 인스턴스가 Member이면 target 참조변수로 obj를 참조함.
            // target 객체의 name 변수 equals 메소드를 호출, 매개값으로 현재 객체의 name을 전달.
        } else{
            return false;
        }
    }
}