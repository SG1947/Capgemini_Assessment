package Week3.Factorymethod;

public class Lazy {
private static Lazy lazy;
private Lazy() {
	
}
public static Lazy lazyInstantiation() {
	if(lazy==null) {
		lazy=new Lazy();
	}
	return lazy;
}
}
