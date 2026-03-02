package DSA.Day2;
public class Demo {
    public static void main(String[] args) {
        System.out.println("Inside the standard public static void main(String[] args) method.");
//        main(10);
//        main("Hello Overload");
    }

    public static void main(int num) {
        System.out.println("Inside the overloaded main(int num) method. Number: " + num);
    }

    public static void main(String message) {
        System.out.println("Inside the overloaded main(String message) method. Message: " + message);
    }
}
