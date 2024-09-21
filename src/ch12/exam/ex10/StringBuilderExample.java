package ch12.exam.ex10;

public class StringBuilderExample {
    public static void main(String[] args) {
        String str = "";
        for(int i = 1; i <= 100; i++){
            str += i;
        }

        System.out.println(str);

        StringBuilder sbr = new StringBuilder();

        for(int i = 1; i <= 100; i++){
            sbr.append(i);
        }

        System.out.println(sbr); // 이렇게 끝내도 되지만
        str = sbr.toString();
        System.out.println(str);
    }
}
