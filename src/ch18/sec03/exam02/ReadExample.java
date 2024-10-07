package ch18.sec03.exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("C:\\study\\java\\Java_Study\\src\\ch18\\sec02\\exam02\\test2.db");

            byte[] data = new byte[100];

            while(true){
                int num = is.read(data); // 읽은 바이트는 data에 저장. 읽은 수를 리턴
                // 처음 while문 들어오면 읽은 수 3을 리턴.
                // for문을 돌고 난 다음
                // 다시 while문 처음으로 와서 읽은 수는 -1을 리턴
                // 그래서 반복 종료
                if(num == -1){
                    break;
                }
                for(int i = 0; i < num; i++){
                    System.out.println(data[i]);
                }
            }
            is.close();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
