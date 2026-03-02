package Week3.Nonprimitivetypecasting.Downcasting;

public class FamilyDriver {

	public static void main(String[] args) {
//      Parent p= new Parent();
//		Child c=(Child)p;  //ClassCastException
//      System.out.println(p.p);
//      p.pm();
//      
      Child c=new Child();
      System.out.println(c);
      Parent upcastedVar=c; //upcasting
      System.out.println(upcastedVar);
      Child downCastedVar=(Child) upcastedVar; //downcasting , stored in parent ref so typecasting required , datatype in which stoing matters  
      System.out.println(downCastedVar);
      System.out.println(downCastedVar.p);
      downCastedVar.pm();
      System.out.println(downCastedVar.c);
      downCastedVar.cm();
      
//      Child c = (Child)p;
//      Child c = new Child();
//      System.out.println(c.c);
//      c.cm();
//      System.out.println(c.p);
//      c.pm();
//     
//      Child c1 = new Child();
//      Parent p1=c1; // p1 is the upcasted variable
//      System.out.println(p1.p);
//      p1.pm();
//      System.out.println(p1.c);
//      p1.cm();
	}

}
