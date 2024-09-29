package ch15.sec04.exam03;

import java.io.InputStream;
import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties(); // properties 객체 생성

        properties.load(PropertiesExample.class.getResourceAsStream("database.properties"));
        // 메모리로 로드

        // 프로퍼티 파일 내용을 키로 읽기
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        String admin = properties.getProperty("admin");

        System.out.println("driver: " + driver);
        System.out.println("url: " + url);
        System.out.println("username: " + username);
        System.out.println("password: " + password);
        System.out.println("admin: " + admin);
    }
}
