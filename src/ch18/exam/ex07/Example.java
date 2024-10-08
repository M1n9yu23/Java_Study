package ch18.exam.ex07;

import java.io.BufferedReader;
import java.io.FileReader;

public class Example {
    public static void main(String[] args) throws Exception{
        String filePath = "C:\\study\\java\\Java_Study\\src\\ch18\\exam\\ex07\\Example.java";

        FileReader fr = new FileReader(filePath); // 문자 입력 스트림 생성
        BufferedReader br = new BufferedReader(fr); // 보조스트림 연결

        int rowNumber = 0;
        String rowData;
        while(true){
            rowData = br.readLine(); // 한 행, 즉 행 단위로 읽기
            if(rowData == null){
                break;
            }
            System.out.println((++rowNumber) + ": " + rowData);
        }
        br.close();
        fr.close();
    }
}
