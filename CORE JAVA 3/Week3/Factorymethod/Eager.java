package Week3.Factorymethod;

public class Eager {
   private static Eager eager = new Eager();//eager initialisation wither in static single line or multiline initialiser
   private Eager() {
	   
   }
   public static Eager eagerInstantiation() {
	   return eager;
   }
}
