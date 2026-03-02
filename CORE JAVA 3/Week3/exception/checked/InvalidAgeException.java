package Week3.exception.checked;

class InvalidAgeException extends Exception{ // checked exception 
          public InvalidAgeException(String message) {
        	  super(message);
          }
}
