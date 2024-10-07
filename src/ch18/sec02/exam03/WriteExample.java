package ch18.sec02.exam03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        try{
            OutputStream os = new FileOutputStream("C:\\study\\java\\Java_Study\\src\\ch18\\sec02\\exam03\\test3.db");

            byte[] array = {10,20,30,40,50};
            os.write(array, 1 , 3); // 배열 1번 인덱스 부터 3개까지 출력
            os.flush();
            os.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}