package Week3.DateandTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

public class Date_Time {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		LocalDate future= today.plusDays(10);
		
		System.out.println(future);
        if (future.isAfter(today)) {
			System.out.println("Valid date");
		}
        
        
        
        
        Period period= Period.between(today, future);
        System.out.println("Days between dates:"+period.getDays());
        LocalTime lt= LocalTime.now();
        System.out.println(lt);
        
        LocalDateTime currentTime= LocalDateTime.now();
        System.out.println(currentTime);
        
        
        
        DateTimeFormatter dateFormatter= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(today.format(dateFormatter));
        System.out.println(currentTime.format(dateTimeFormatter));

        
        String dateString = "24/09/2019";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(dateString, formatter);
        System.out.println("Converted Date: " + localDate);
//          Date date1 =new Date();
//          Date date2 =new Date();
//          System.out.println(date1);
//          System.out.println(date2);
//          if(date2.before(date2)) System.out.println("BEFORE");
//          if(date2.after(date1)) System.out.println("AFTER");
//          if(date2.equals(date1)) System.out.println("EQUAL");
//          int comp=date1.compareTo(date2);
//          System.out.println(comp);
//          Instant instant = Instant.now();
//          Date date3 = Date.from(instant);
//          System.out.println(date3);
          
	}

}
