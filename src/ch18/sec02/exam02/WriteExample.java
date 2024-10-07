package ch18.sec02.exam02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        try{
            OutputStream os = new FileOutputStream("C:\\study\\java\\Java_Study\\src\\ch18\\sec02\\exam02\\test2.db");
            // 도착지를 test2.db로 하는 바이트 출력 스트림 생성

            byte[] array = {10,20,30};
            os.write(array);

            os.flush();
            os.close();

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
