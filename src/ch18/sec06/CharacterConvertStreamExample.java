package ch18.sec06;

import java.io.*;

public class CharacterConvertStreamExample {
    public static void main(String[] args) throws Exception{
        write("문자 변환 스트림을 사용합니다.");
        String data = read();
        System.out.println(data);
    }

    public static void write(String str) throws Exception{
        OutputStream os = new FileOutputStream("C:\\study\\java\\Java_Study\\src\\ch18\\sec06\\test.txt");
        Writer writer = new OutputStreamWriter(os, "UTF-8");
        // 스트림 연결
        writer.write(str);
        writer.flush();
        writer.close();
    }

    public static String read() throws Exception{
        InputStream is = new FileInputStream("C:\\study\\java\\Java_Study\\src\\ch18\\sec06\\test.txt");
        Reader reader = new InputStreamReader(is, "UTF-8");
        char[] data = new char[100];
        int num = reader.read(data);
        // data에 문자 입력하고 num에 읽은 수가 대입
        reader.close();
        String str = new String(data, 0 , num); // 배열에서 0번부터 읽은 수 만큼 문자열로 변환
        return str;
    }
}
