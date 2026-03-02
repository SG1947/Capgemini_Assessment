package Week3.Wrapper;

public class ParseString {

    public static void main(String[] args) {

//        String s1 = "-1";
//        byte b1 = Byte.parseByte(s1);
//        System.out.println(b1);
//
//        String s2 = "+1";
//        byte b2 = Byte.parseByte(s2);
//        System.out.println(b2);
//
//        String s3 = "1";
//        byte b3 = Byte.parseByte(s3);
//        System.out.println(b3);
//
//        String s4 = "-0";
//        byte b4 = Byte.parseByte(s4);
//        System.out.println(b4);
//
//        String s5 = "+0";
//        byte b5 = Byte.parseByte(s5);
//        System.out.println(b5);
//
//        String s6 = "0";
//        byte b6 = Byte.parseByte(s6);
//        System.out.println(b6);
//NumberFormatException
//       String s7 = "1+";
//       byte b7 = Byte.parseByte(s7);
//       System.out.println(b7);

//        String s8 = "1-";
//        byte b8 = Byte.parseByte(s8);
//        System.out.println(b8);

//        String s9 = "++";
//        byte b9 = Byte.parseByte(s9);
//        System.out.println(b9);
//
//        String s10 = "--";
//        byte b10 = Byte.parseByte(s10);
//        System.out.println(b10);

//        String s11 = "a";
//        byte b11 = Byte.parseByte(s11);
//        System.out.println(b11);

//        String s12 = "a0";
//        byte b12 = Byte.parseByte(s12);
//        System.out.println(b12);
//
//        String s13 = "a9";
//        byte b13 = Byte.parseByte(s13);
//        System.out.println(b13);

//        String s14 = "!";
//        byte b14 = Byte.parseByte(s14);
//        System.out.println(b14);
//
//        String s15 = "";
//        byte b15 = Byte.parseByte(s15);
//        System.out.println(b15);

//        String s16 = " ";
//        byte b16 = Byte.parseByte(s16);
//        System.out.println(b16);
    	    String s1 = "!jh12d3";
        try {
         byte b1 = Byte.parseByte(s1);
         System.out.println(b1);	
		} catch (NumberFormatException e) {
			String res="";
			
			for (int i = 0; i < s1.length(); i++) {
	            if (Character.isDigit(s1.charAt(i))) {
	                try {
	                    Byte.parseByte(res + s1.charAt(i));
	                    res += s1.charAt(i);
	                } catch (NumberFormatException e1) {
	                    break;
	                }
	            }
			}
			if(res!="") { 
			byte b2=Byte.parseByte(res);
			
			System.out.println(b2);}
			else {
			System.out.println(e.getMessage() + ":Parsing can't be performed");
			}
		}
    }
}
