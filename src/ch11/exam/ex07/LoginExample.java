package ch11.exam.ex07;

public class LoginExample {
    public static void main(String[] args) {
        try{
            login("white", "12345");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            login("blue", "54321");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void login(String id, String password) throws NotExistIDException,WrongPasswordException {
        if(!id.equals("blue")){
            throw new NotExistIDException("아이디 문제 발생");
        }

        if(!password.equals("12345")){
            throw new WrongPasswordException("비밀번호 문제 발생");
        }
    }
}
