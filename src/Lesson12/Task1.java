package Lesson12;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        DateOfMeet[] dates = new DateOfMeet[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter description");
            Scanner sc = new Scanner(System.in);
            String description = sc.nextLine();
            System.out.println("Enter name of meeting");
            String meetingName = sc.nextLine();
            System.out.println("Enter time");
            String time = sc.nextLine();
            System.out.println("Enter weekday");
            String days = sc.nextLine().toLowerCase();
            String day = days.substring(0, 1).toUpperCase() + days.substring(1);
            System.out.println("Enter month");
            String month = sc.nextLine().toLowerCase();
            String months = month.substring(0, 1).toUpperCase() + month.substring(1);
            DateOfMeet dateOfMeet = new DateOfMeet(description, meetingName, time, WeekDay.valueOf(day),
                    Month.valueOf(months));
            dates[i] = dateOfMeet;
        }
        for (DateOfMeet event : dates) {
            event.show();
            System.out.println("Next event");
        }
    }
}

enum WeekDay {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday}

enum Month {January, February, March, April, May, June, July, August, September, October, November, December}

class DateOfMeet {
    String description;
    String meetingName;
    String time;
    WeekDay day;
    Month month;

    public DateOfMeet(String description, String meetingName, String time, WeekDay day, Month month) {
        this.description = description;
        this.meetingName = meetingName;
        this.time = time;
        this.day = day;
        this.month = month;
    }

    void show() {
        System.out.println(" Description: " + description + " Name of meeting: " + meetingName + " Meeting Time: " + time +
                " Day of week: " + day + " Month: " + month);
    }
}