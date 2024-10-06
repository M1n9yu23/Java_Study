package ch18.sec02.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        try{
            OutputStream os = new FileOutputStream("C:\\study\\java\\Java_Study\\src\\ch18\\sec02\\exam01\\test1.db");
            // 도착지를 test1.db 파일로 하는 바이트 출력 스트림 생성

            byte a = 10;
            byte b = 20;
            byte c = 30;

            int d = 100;
            int e = 300;

            os.write(a);
            os.write(b);
            os.write(c);
            os.write(d);
            os.write(e);

            os.flush(); // 버퍼에 잔류하는 바이트를 출력하고 버퍼를 비움.
            os.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
