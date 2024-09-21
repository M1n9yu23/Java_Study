package ch12.exam.ex15;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Example15 {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();

        LocalDateTime time2 = LocalDateTime.of(time.getYear(),12,31,0,0,0);
        long day = time.until(time2, ChronoUnit.DAYS);
        System.out.println("남은 일자: " + day);
    }
}
