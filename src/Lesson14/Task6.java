package Lesson14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Task6 {
    public static void main(String[] args) {
        GregorianCalendar gcal= new GregorianCalendar(2020, Calendar.AUGUST, 7);
        System.out.println(gcal.getTime());
        gcal.add(Calendar.DAY_OF_MONTH, 21);
        System.out.println(gcal.getTime());
        gcal.add(Calendar.WEEK_OF_MONTH, 3);
        System.out.println(gcal.getTime());
        gcal.add(Calendar.DAY_OF_MONTH, -300);
        System.out.println(gcal.getTime());


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy, MMMM, dd HH:mm");
        //LocalDateTime localDateTime = LocalDateTime.parse("2020.08.12", dateTimeFormatter);
        LocalDateTime localDateTime = LocalDateTime.from(dateTimeFormatter.parse("2020, August, 20 14:15"));
        System.out.println("LocalDateTime: "+localDateTime);

        LocalDate today = LocalDate.now();
        System.out.println("The current date: " + today);
        System.out.println("The current date plus 21 days: " + today.plusDays(21));
        System.out.println("The current date plus 3 weeks: " + today.plusWeeks(3));
        System.out.println("The current date minus 100 days: " + today.plusDays(-100));

    }
}