package ch18.sec03.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("C:\\study\\java\\Java_Study\\src\\ch18\\sec02\\exam01\\test1.db");
            // 출발지를 test1.db로 입력 스트림 생성

            while (true) {
                int data = is.read();
                if (data == -1) {
                    break;
                }
                System.out.println(data);
            }
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
