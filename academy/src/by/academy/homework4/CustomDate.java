package by.academy.homework4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CustomDate {
    Scanner scanner = new Scanner(System.in);
    private static final String text = "((0[1-9]|[12][0-9]|3[01])(-)(0[1-9]|1[012])(-)((19|20)\\d\\d))";
    private static final Pattern pattern = Pattern.compile(text);

    private int year;
    private int month;
    private int day;
    private String date;
    Year year0 = new Year();
    Day day0 = new Day();

    public CustomDate() {
        super();
    }

    public CustomDate(String date) {
        super();
        this.date = date;
    }


    public String validate() {
        date = scanner.nextLine();

        if (!pattern.matcher(date).matches()) {
            return null;
        }
        return date;
    }

    public LocalDate dateFormat() {
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate = LocalDate.parse(date, formatDate);
        return localDate;
    }

    public CustomDate(int year, int month, int day) {
        super();
        this.year = year;
        this.month = month;
        this.day = day;

    }

    public class Year {

        public boolean isLeapsYear() {
            boolean leapsYear;
            int year = dateFormat().getYear();
            if (year % 4 == 0 && year % 100 != 0) {
                leapsYear = true;
            } else {
                leapsYear = false;
            }
            return leapsYear;
        }


    }

    public class Month {
    }

    public class Day {
        int codeOfMonth;
        int codeOfYear;
        int dayNum;

        public int dayOfWeek() {

            switch (dateFormat().getMonth()) {
                case JANUARY, OCTOBER:
                    codeOfMonth = 1;
                    break;
                case MAY:
                    codeOfMonth = 2;
                    break;
                case AUGUST:
                    codeOfMonth = 3;
                    break;
                case FEBRUARY, MARCH, NOVEMBER:
                    codeOfMonth = 4;
                    break;
                case JUNE:
                    codeOfMonth = 5;
                    break;
                case SEPTEMBER, DECEMBER:
                    codeOfMonth = 6;
                    break;
                case APRIL, JULY:
                    codeOfMonth = 0;
                    break;
            }
            codeOfYear = (6 + dateFormat().getYear() % 100 + (dateFormat().getYear() % 100) / 4) % 7;
            dayNum = (dateFormat().getDayOfMonth() + codeOfMonth + codeOfYear) % 7;

            if (dateFormat().getDayOfMonth() <= 31 && dateFormat().getMonthValue() == 1 && year0.isLeapsYear() == true) {
                dayNum = ((dateFormat().getDayOfMonth() + codeOfMonth + codeOfYear) % 7) - 1;
            }

            if (dateFormat().getDayOfMonth() <= 29 && dateFormat().getMonthValue() == 2 && year0.isLeapsYear() == true) {
                dayNum = ((dateFormat().getDayOfMonth() + codeOfMonth + codeOfYear) % 7) - 1;
            }





            return dayNum;
        }

        public void outputDay() {
            switch (dayNum) {
                case 0:
                    System.out.println(DaysOfWeek.SATURDAY);
                    break;
                case 1:
                    System.out.println(DaysOfWeek.SUNDAY);
                    break;
                case 2:
                    System.out.println(DaysOfWeek.MONDAY);
                    break;
                case 3:
                    System.out.println(DaysOfWeek.TUESDAY);
                    break;
                case 4:
                    System.out.println(DaysOfWeek.WEDNESDAY);
                    break;
                case 5:
                    System.out.println(DaysOfWeek.THURSDAY);
                    break;
                case 6:
                    System.out.println(DaysOfWeek.FRIDAY);
                    break;
            }

        }
    }

}

