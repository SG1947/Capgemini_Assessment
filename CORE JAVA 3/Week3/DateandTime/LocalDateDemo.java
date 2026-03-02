package Week3.DateandTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
public class LocalDateDemo {

    public static void main(String[] args) {

        // Current Date
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);

        //  Creating Specific Date
        LocalDate specificDate = LocalDate.of(2026, 12, 25);
        System.out.println("Specific Date: " + specificDate);

        // Parsing Date from String
        LocalDate parsedDate = LocalDate.parse("2026-02-28");
        System.out.println("Parsed Date: " + parsedDate);

        //  Getting Date Information
        System.out.println("Year: " + today.getYear());
        System.out.println("Month: " + today.getMonth());
        System.out.println("Month Value: " + today.getMonthValue());
        System.out.println("Day of Month: " + today.getDayOfMonth());
        System.out.println("Day of Week: " + today.getDayOfWeek());
        System.out.println("Day of Year: " + today.getDayOfYear());

        //  Adding Dates
        LocalDate plusDays = today.plusDays(10);
        LocalDate plusWeeks = today.plusWeeks(2);
        LocalDate plusMonths = today.plusMonths(1);
        LocalDate plusYears = today.plusYears(1);

        System.out.println("After 10 Days: " + plusDays);
        System.out.println("After 2 Weeks: " + plusWeeks);
        System.out.println("After 1 Month: " + plusMonths);
        System.out.println("After 1 Year: " + plusYears);

        // Subtracting Dates
        LocalDate minusDays = today.minusDays(5);
        LocalDate minusMonths = today.minusMonths(2);
        LocalDate minusYears = today.minusYears(3);

        System.out.println("Before 5 Days: " + minusDays);
        System.out.println("Before 2 Months: " + minusMonths);
        System.out.println("Before 3 Years: " + minusYears);

        //  Comparing Dates
        System.out.println("Is plusDays after today? " + plusDays.isAfter(today));
        System.out.println("Is minusDays before today? " + minusDays.isBefore(today));
        System.out.println("Is today equal to parsedDate? " + today.isEqual(parsedDate));

        System.out.println("Compare today with plusDays: " + today.compareTo(plusDays));

        //  Leap Year Check
        System.out.println("Is Leap Year? " + today.isLeapYear());

        //  Modify Specific Fields
        LocalDate changedYear = today.withYear(2030);
        LocalDate changedMonth = today.withMonth(12);
        LocalDate changedDay = today.withDayOfMonth(1);

        System.out.println("Changed Year: " + changedYear);
        System.out.println("Changed Month: " + changedMonth);
        System.out.println("Changed Day of Month: " + changedDay);

        //  First and Last Day of Month
        LocalDate firstDay = today.withDayOfMonth(1);
        LocalDate lastDay = today.withDayOfMonth(today.lengthOfMonth());

        System.out.println("First Day of Month: " + firstDay);
        System.out.println("Last Day of Month: " + lastDay);

        //  Difference Between Two Dates (Period)
        Period period = Period.between(today, plusDays);
        System.out.println("Difference (Period): " + period.getDays() + " days");


        //  Formatting Date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = today.format(formatter);
        System.out.println("Formatted Date: " + formattedDate);
    }
}

