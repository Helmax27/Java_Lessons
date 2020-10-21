package Lesson12;

enum WeekDays {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday}

enum Months {January, February, March, April, May, June, July, August, September, October, November, December}

public class Task2 {
    public static void main(String[] args) {
        BookOfMeeting events = new BookOfMeeting();
        DateOfMeets event1= new DateOfMeets("Meeting with customer", "Project", "14.00", WeekDays.valueOf("Thursday"), Months.July, 16);
        events.addMeeting(event1);
        DateOfMeets event2= new DateOfMeets("Java", "Lesson 5", "14.00", WeekDays.Thursday, Months.July, 16);
        events.addMeeting(event2);
        DateOfMeets event3= new DateOfMeets("Java", "Lesson 15", "12.00", WeekDays.Friday, Months.August, 21);
        events.addMeeting(event3);
        events.display();
    }
}

class DateOfMeets {
    String description;
    String meetingName;
    String time;
    WeekDays day;
    Months month;
    int calendarNumber;

    public DateOfMeets(String description, String meetingName, String time, WeekDays day, Months month, int calendarNumber) {
        this.description = description;
        this.meetingName = meetingName;
        this.time = time;
        this.day = day;
        this.month = month;
        this.calendarNumber = calendarNumber;
    }


    void show() {
        System.out.println(" Description: " + description + " Name of meeting: " + meetingName + " Meeting Time: " + time +
                " Day of week: " + day + " Month: " + month);
    }
}

class BookOfMeeting {
    DateOfMeets[] bookOfMeeting = new DateOfMeets[366];

    public BookOfMeeting() {
        int index = 0;
        int indexOfFirstDate = 2;
        for (int i = 1; i < 32; i++) {
            bookOfMeeting[index] = new DateOfMeets("1", "1", "1", WeekDays.values()[indexOfFirstDate], Months.January, i);
            indexOfFirstDate++;
            index++;
            if (indexOfFirstDate > 6) {
                indexOfFirstDate = 0;
            }
        }
        for (int i = 1; i < 30; i++) {
            bookOfMeeting[index] = new DateOfMeets("1", "1", "1", WeekDays.values()[indexOfFirstDate], Months.February, i);
            indexOfFirstDate++;
            index++;
            if (indexOfFirstDate > 6) {
                indexOfFirstDate = 0;
            }
        }
        for (int i = 1; i < 32; i++) {
            bookOfMeeting[index] = new DateOfMeets("1", "1", "1", WeekDays.values()[indexOfFirstDate], Months.March, i);
            indexOfFirstDate++;
            index++;
            if (indexOfFirstDate > 6) {
                indexOfFirstDate = 0;
            }
        }
        for (int i = 1; i < 31; i++) {
            bookOfMeeting[index] = new DateOfMeets("1", "1", "1", WeekDays.values()[indexOfFirstDate], Months.April, i);
            indexOfFirstDate++;
            index++;
            if (indexOfFirstDate > 6) {
                indexOfFirstDate = 0;
            }
        }
        for (int i = 1; i < 32; i++) {
            bookOfMeeting[index] = new DateOfMeets("1", "1", "1", WeekDays.values()[indexOfFirstDate], Months.May, i);
            indexOfFirstDate++;
            index++;
            if (indexOfFirstDate > 6) {
                indexOfFirstDate = 0;
            }
        }
        for (int i = 1; i < 31; i++) {
            bookOfMeeting[index] = new DateOfMeets("1", "1", "1", WeekDays.values()[indexOfFirstDate], Months.June, i);
            indexOfFirstDate++;
            index++;
            if (indexOfFirstDate > 6) {
                indexOfFirstDate = 0;
            }
        }
        for (int i = 1; i < 32; i++) {
            bookOfMeeting[index] = new DateOfMeets("1", "1", "1", WeekDays.values()[indexOfFirstDate], Months.July, i);
            indexOfFirstDate++;
            index++;
            if (indexOfFirstDate > 6) {
                indexOfFirstDate = 0;
            }
        }
        for (int i = 1; i < 32; i++) {
            bookOfMeeting[index] = new DateOfMeets("1", "1", "1", WeekDays.values()[indexOfFirstDate], Months.August, i);
            indexOfFirstDate++;
            index++;
            if (indexOfFirstDate > 6) {
                indexOfFirstDate = 0;
            }
        }
        for (int i = 1; i < 31; i++) {
            bookOfMeeting[index] = new DateOfMeets("1", "1", "1", WeekDays.values()[indexOfFirstDate], Months.September, i);
            indexOfFirstDate++;
            index++;
            if (indexOfFirstDate > 6) {
                indexOfFirstDate = 0;
            }
        }
        for (int i = 1; i < 32; i++) {
            bookOfMeeting[index] = new DateOfMeets("1", "1", "1", WeekDays.values()[indexOfFirstDate], Months.October, i);
            indexOfFirstDate++;
            index++;
            if (indexOfFirstDate > 6) {
                indexOfFirstDate = 0;
            }
        }
        for (int i = 1; i < 31; i++) {
            bookOfMeeting[index] = new DateOfMeets("1", "1", "1", WeekDays.values()[indexOfFirstDate], Months.November, i);
            indexOfFirstDate++;
            index++;
            if (indexOfFirstDate > 6) {
                indexOfFirstDate = 0;
            }
        }
        for (int i = 1; i < 32; i++) {
            bookOfMeeting[index] = new DateOfMeets("1", "1", "1", WeekDays.values()[indexOfFirstDate], Months.December, i);
            indexOfFirstDate++;
            index++;
            if (indexOfFirstDate > 6) {
                indexOfFirstDate = 0;
            }
        }
    }

    void addMeeting(DateOfMeets event) {
        int flag = 0;
        for (DateOfMeets ev : bookOfMeeting) {
            if (ev.day == event.day && ev.month == event.month && ev.time.equals("1") && ev.calendarNumber == event.calendarNumber) {
                ev.time = event.time;
                ev.description = event.description;
                ev.meetingName = event.meetingName;
                flag = 1;
            }

        }
        if (flag == 0) {
            System.out.println("This time is already taken");
        }
    }

    void display() {
        for (DateOfMeets ev : bookOfMeeting) {
            if (ev.time != ("1")) {
                System.out.println("Meeting list:");
                System.out.println(" Description: " + ev.description + " Name of meeting: " + ev.meetingName +
                        " Day of week: " + ev.day + " Month: " + ev.month + " Calendar day " + ev.calendarNumber + " Meeting Time: " + ev.time);

            }
        }
    }

}