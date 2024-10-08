package ch18.sec11;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) throws Exception {
        File dir = new File("C:\\study\\java\\Java_Study\\src\\ch18\\sec11\\images");
        File file1 = new File("C:\\study\\java\\Java_Study\\src\\ch18\\sec11\\file1.txt");
        File file2 = new File("C:\\study\\java\\Java_Study\\src\\ch18\\sec11\\file2.txt");
        File file3 = new File("C:\\study\\java\\Java_Study\\src\\ch18\\sec11\\file3.txt");

        if (dir.exists() == false) {
            dir.mkdirs();
        }

        if (file1.exists() == false) {
            file1.createNewFile();
        }
        if (file2.exists() == false) {
            file2.createNewFile();
        }

        if (file3.exists() == false) {
            file3.createNewFile();
        }

        File temp = new File("C:\\study\\java\\Java_Study\\src\\ch18\\sec11");
        File[] contents = temp.listFiles(); // 폴더에 포함된 파일 및 서브 디렉토리 목록 전부를 배열로 리턴

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
        for (File file : contents) { // 리턴 받은 요소들을 순회.
            System.out.printf("%-25s", sdf.format(new Date(file.lastModified())));
            if (file.isDirectory()) {
                // 디렉토리인지 확인
                System.out.printf("%-10s%-20s", "<DIR>", file.getName());
            } else {
                System.out.printf("%-10s%-20s", file.length(), file.getName());
            }
            System.out.println();
        }
    }
}