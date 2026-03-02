package Week3.DateandTime;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class decimal {
public static void main(String[] args) {
	double a=0.1;
	double b=0.2;
	System.out.println("Result:"+(a+b));
	BigDecimal bd1 = new BigDecimal("0.1");
	BigDecimal bd2 = new BigDecimal("0.2");
	BigDecimal sum= bd1.add(bd2);
	System.out.println("Modified Result:"+ sum);
	BigInteger bi=new BigInteger("100");
	BigInteger bi1=new BigInteger("300");
	System.out.println(bi.gcd(bi1));
	
	// WHAT: Rounding values
	BigDecimal tax = new BigDecimal("18.56789");

	// HOW: Apply rounding rule
	BigDecimal roundedTax =
	        tax.setScale(2, RoundingMode.HALF_UP);

	System.out.println("Rounded tax: " + roundedTax);

	// WHY: Financial safety
	BigDecimal salary = new BigDecimal("50000");
	BigDecimal bonus = new BigDecimal("7500");

	BigDecimal totalSalary =
	        salary.add(bonus).setScale(2, RoundingMode.HALF_UP);
	System.out.println("Total Salary: " + totalSalary);
	BigDecimal a1=new BigDecimal("1023");
	a1.setScale(2, RoundingMode.HALF_UP);
//    BigInteger bi =new BigInteger("100");
//    BigInteger bi1 =new BigInteger("100");
//	bi.multiply(bi1);
    totalSalary.setScale(2, RoundingMode.HALF_UP);
    LocalTime time=LocalTime.of(12, 15,40);
    System.out.println(time);
    DateTimeFormatter formatter =DateTimeFormatter.ofPattern("HH-mm-ss");
    String time1=time.format(formatter);
    System.out.println(time1);
    LocalDate date=LocalDate.of(2012, 12, 14);
    LocalDate date1=LocalDate.now();
    int comp=date.compareTo(date);
    System.out.println(comp);
    System.out.println(date);
    System.out.println(date.getDayOfWeek());
    DateTimeFormatter formatter1 =DateTimeFormatter.ofPattern("yyyy/MM/dd");
    String day1=date.format(formatter1);
    
    
    System.out.println(day1);
    Period period =Period.between(date, date1);
    System.out.println(period.getDays());
    
    Duration duration=Duration.between(time, time.plusHours(2));
    System.out.println(duration.toHours());
    
    LocalDateTime ldt=LocalDateTime.of(2012, 9, 12, 12, 14, 37);
    LocalDateTime ldt1=LocalDateTime.now();
    DateTimeFormatter fmt=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    System.out.println(ldt1.format(fmt));
}
}
