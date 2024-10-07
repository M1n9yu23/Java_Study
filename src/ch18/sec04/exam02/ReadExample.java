package ch18.sec04.exam02;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {
    public static void main(String[] args) {
        try{
            Reader reader = null;

            reader = new FileReader("C:\\study\\java\\Java_Study\\src\\ch18\\sec04\\exam01\\test.txt");
            while(true){
                int data = reader.read();
                if(data == -1){
                    break;
                }
                char c = (char) data;
                System.out.print(c);
            }
            reader.close();
            System.out.println();

            reader = new FileReader("C:\\study\\java\\Java_Study\\src\\ch18\\sec04\\exam01\\test.txt");
            char[] data = new char[100];
            while(true){
                int num = reader.read(data); // 읽은 수를 리턴
                if(num == -1){
                    break;
                }
                for(int i = 0; i < num; i++){
                    System.out.print(data[i]);
                }
            }
            reader.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
