package ch18.exam.ex10;

import java.io.*;

public class Example {
    public static void main(String[] args) throws Exception{
        String file = "C:\\study\\java\\Java_Study\\src\\ch18\\exam\\ex10\\dir1\\photo1.jpg";
        String targetFile = "C:\\study\\java\\Java_Study\\src\\ch18\\exam\\ex10\\dir2\\photo2.jpg";


        System.out.println("원본 파일 경로: " + file);
        System.out.println("복사 파일 경로: " + targetFile);

        File fe = new File(file);
        File target_fe2 = new File(targetFile);
        File targetParentFile = target_fe2.getParentFile();

        if(fe.exists() == false){
            System.out.println("원본 파일이 존재하지 않습니다.");
            System.exit(0);
        }

        if(targetParentFile.exists() == false){
            targetParentFile.mkdirs();
        }


        FileInputStream fis = new FileInputStream(file); // 바이트 입력 스트림 생성
        FileOutputStream fos = new FileOutputStream(targetFile); // 바이트 출력 스트림 생성
        BufferedInputStream bis = new BufferedInputStream(fis); // 보조 스트림 연결
        BufferedOutputStream bos = new BufferedOutputStream(fos); // 보조 스트림 연결

        int data = 0;

        while(true){
            data = bis.read(); // 1바이트를 읽고
            if(data == -1){
                break;
            }
            bos.write(data); // 1바이트를 출력
        }
        System.out.println("복사가 성공되었습니다.");

        bos.flush();
        bos.close();
        bis.close();
        fos.close();
        fis.close();
    }
}