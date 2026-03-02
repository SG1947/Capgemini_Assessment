package Week3.DateandTime;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class currency {
public static void main(String[] args) {
	// WHAT: Currency as an object
	
	Currency inr = Currency.getInstance("INR");
	Currency usd = Currency.getInstance("USD");

	System.out.println("INR Code: " + inr.getCurrencyCode());
	System.out.println("USD Symbol: " + usd.getSymbol());

	// WHY: Same amount, different countries
	BigDecimal amount = new BigDecimal("125000.75");

	// HOW: Locale-based currency formatting
	NumberFormat indiaFormat =
	        NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
	NumberFormat usFormat =
	        NumberFormat.getCurrencyInstance(Locale.US);
	NumberFormat ukFormat =
	        NumberFormat.getCurrencyInstance(Locale.UK);

	System.out.println("India Format: " + indiaFormat.format(amount));
	System.out.println("US Format: " + usFormat.format(amount));
	System.out.println("UK Format: " + ukFormat.format(amount));

	// WHY: Avoid hardcoded currency symbols
	System.out.println("Currency symbol from object: " +
	        inr.getSymbol(new Locale("en", "IN")));

}
}

//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.time.format.DateTimeParseException;
//import java.util.Locale;

//public class currency {
//    public static void main(String[] args) {
//        String dateString = "24/09/2019";
//        // Define the pattern to match the input string
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//
//        try {
//            LocalDate localDate = LocalDate.parse(dateString, formatter);
//            System.out.println("Converted Date: " + localDate);
//        } catch (DateTimeParseException e) {
//            System.err.println("Error parsing date: " + e.getMessage());
//        }
//    }
//}
//

