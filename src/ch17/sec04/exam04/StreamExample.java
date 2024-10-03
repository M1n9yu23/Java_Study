package ch17.sec04.exam04;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) throws Exception{
        Path path = Paths.get(StreamExample.class.getResource("data.txt").toURI());
        // StreamExample 클래스의 클래스패스 경로에서 파일을 찾음.

        Stream<String> stream = Files.lines(path, Charset.defaultCharset());
        // path가 참조하는 파일을 열고 스트림을 얻음.
        // 기본 UTF-8
        stream.forEach(line -> {
            System.out.println(line);
        });
        stream.close();
    }
}