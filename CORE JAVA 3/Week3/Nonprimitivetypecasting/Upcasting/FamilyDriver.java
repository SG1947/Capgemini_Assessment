package Week3.Nonprimitivetypecasting.Upcasting;

public class FamilyDriver {

	public static void main(String[] args) {
      Parent p= new Parent();
      System.out.println(p.p);
      p.pm();
   
      Child c = new Child();
      System.out.println(c.c);
      c.cm();
      System.out.println(c.p);
      c.pm();
     
      Child c1 = new Child();
      Parent p1=c1; // p1 is the upcasted variable
      System.out.println(p1.p);
      p1.pm();
//      System.out.println(p1.c);
//      p1.cm();
	}

}
