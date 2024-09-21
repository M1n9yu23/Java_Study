package ch12.exam.ex17;

import java.util.regex.Pattern;

public class PatternMatcherExample {
    public static void main(String[] args) {
        String id = "5Angel1004";
        String regExp = "[a-zA-Z][a-zA-Z0-9]{8,12}";
        boolean isMatch = Pattern.matches(regExp,id);
        if(isMatch){
            System.out.println("id로 사용 O");
        } else{
            System.out.println("id로 사용 X");
        }
    }
}
