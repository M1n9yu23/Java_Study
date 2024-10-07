package ch18.sec03.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {
    public static void main(String[] args) throws Exception{
        String originalFileName = "C:\\study\\java\\Java_Study\\src\\ch18\\sec03\\exam03\\test.jpg";
        String targetFileName = "C:\\study\\java\\Java_Study\\src\\ch18\\sec03\\exam03\\test2.jpg";

        InputStream is = new FileInputStream(originalFileName);
        OutputStream os = new FileOutputStream(targetFileName);

        byte[] data = new byte[1024];
/*
        while(true){
            int num = is.read(data);
            if(num == -1){
                break;
            }
            os.write(data, 0, num); // data 배열에서 0부터 읽은 수 까지 출력
        }*/

        is.transferTo(os); // 입력 스트림에서 출력 스트림으로 바이트를 복사하는 메소드가 InputStream에 추가 되었음.

        os.flush();
        os.close();
        is.close();

        System.out.println("복사가 잘 되었습니다.");
    }
}
