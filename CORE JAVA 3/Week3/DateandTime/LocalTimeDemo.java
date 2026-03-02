package Week3.DateandTime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class LocalTimeDemo {

    public static void main(String[] args) {

        //  Current Time
        LocalTime now = LocalTime.now();
        System.out.println("Current Time: " + now);

        //  Creating Specific Time
        LocalTime specificTime = LocalTime.of(14, 30, 45);
        System.out.println("Specific Time: " + specificTime);

        //  Parsing Time from String
        LocalTime parsedTime = LocalTime.parse("10:15:30");
        System.out.println("Parsed Time: " + parsedTime);

        //  Getting Time Information
        System.out.println("Hour: " + now.getHour());
        System.out.println("Minute: " + now.getMinute());
        System.out.println("Second: " + now.getSecond());
        System.out.println("Nano: " + now.getNano());

        //  Adding Time
        LocalTime plusHours = now.plusHours(2);
        LocalTime plusMinutes = now.plusMinutes(30);
        LocalTime plusSeconds = now.plusSeconds(45);
        LocalTime plusNanos = now.plusNanos(1000);

        System.out.println("After 2 Hours: " + plusHours);
        System.out.println("After 30 Minutes: " + plusMinutes);
        System.out.println("After 45 Seconds: " + plusSeconds);
        System.out.println("After 1000 Nanos: " + plusNanos);

        //  Subtracting Time
        LocalTime minusHours = now.minusHours(1);
        LocalTime minusMinutes = now.minusMinutes(15);
        LocalTime minusSeconds = now.minusSeconds(20);

        System.out.println("Before 1 Hour: " + minusHours);
        System.out.println("Before 15 Minutes: " + minusMinutes);
        System.out.println("Before 20 Seconds: " + minusSeconds);

        //  Comparing Times
        System.out.println("Is plusHours after now? " + plusHours.isAfter(now));
        System.out.println("Is minusHours before now? " + minusHours.isBefore(now));
        System.out.println("Is now equal to parsedTime? " + now.equals(parsedTime));

        System.out.println("Compare now with plusHours: " + now.compareTo(plusHours));

        //  Modify Specific Fields
        LocalTime changedHour = now.withHour(8);
        LocalTime changedMinute = now.withMinute(0);
        LocalTime changedSecond = now.withSecond(0);

        System.out.println("Changed Hour: " + changedHour);
        System.out.println("Changed Minute: " + changedMinute);
        System.out.println("Changed Second: " + changedSecond);

      

        //  Difference Between Two Times (Duration)
        Duration duration = Duration.between(now, plusHours);
        System.out.println("Difference (Duration): " + duration.toHours() + " hours");

        //  Formatting Time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
       
        String formattedTime = now.format(formatter);
        System.out.println("Formatted Time: " + formattedTime);
        
    }
}
