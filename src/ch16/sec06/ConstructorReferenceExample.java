package ch16.sec06;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();

        Member m1 = person.getMember1((id) ->{
            return new Member(id);
        });
        System.out.println("생성자 참조가 아닌 람다");
        System.out.println(m1);
        System.out.println();

        m1 = person.getMember1(Member :: new);
        System.out.println("생성자 참조인 람다");
        System.out.println(m1);
        System.out.println();

        m1 = person.getMember2((id, name) ->{
            return new Member(id,name);
        });
        System.out.println("생성자 참조가 아닌 람다");
        System.out.println(m1);
        System.out.println();

        m1 = person.getMember2(Member :: new);
        System.out.println("생성자 참조인 람다");
        System.out.println(m1);

    }
}
