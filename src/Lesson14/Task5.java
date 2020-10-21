package Lesson14;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Task5 {
    public static void main(String[] args) {
        Date date = new Date();
        Date birthday = new Date(90, 6, 3, 15, 0, 22);
        Calendar calendare = new GregorianCalendar(1990, 6, 3);
        calendare.set(calendare.MONTH, 8);
        System.out.println(calendare.get(Calendar.DAY_OF_YEAR));
        System.out.println(date);
        System.out.println(birthday);

        ZoneId timezone = ZoneId.of("Asia/Shanghai");

        LocalDate today = LocalDate.now(timezone);
        System.out.println(today);
        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalTime timeOf = LocalTime.of(12, 11, 10, 1000);
        System.out.println(timeOf);
        LocalDateTime local = LocalDateTime.now();
        System.out.println(local);
        Instant timestap = Instant.now();
        System.out.println(timestap);

       // for (String s: ZoneId.getAvailableZoneIds()) System.out.println(s);
    }
}
