package Lesson23;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Task4 {
    public static void main(String...args) {
        String strDate;
        String pattern;
        DateTimeFormatter formatter;
        LocalDate date;

        strDate = "30-09-2020 17:22:22";
        //pattern = "dd-MM-yyyy HH:mm:ss";
        pattern = "dd-MM-yyyy";
        formatter = DateTimeFormatter.ofPattern(pattern);


        try {
            date = LocalDate.parse(strDate.substring(0,10), formatter);
            if (date.getYear() > 2017 && date.isBefore(LocalDate.now())){

            System.out.println(formatter.format(date));}
            else
                System.out.println("Incorrect date");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
