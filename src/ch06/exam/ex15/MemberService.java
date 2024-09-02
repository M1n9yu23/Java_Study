package ch06.exam.ex15;

public class MemberService {
    String name;
    String id;
    String password;
    int age;

    public MemberService(){
    }

    public boolean login(String id, String password){
        if(id == "hong" && password == "12345"){
            this.id = id;
            this.password = password;
            return true;
        }
        else{
            return false;
        }
    }

    public void logout(String id){
        System.out.println(id + "님이 로그아웃 되었습니다.");
    }
}
