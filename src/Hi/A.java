package Hi;

class AD {
	public String nosie() {return"peep";}
	

}
class B extends AD{
	public String nosie() {return "bark";}
	
}
class C extends AD{
	public String noise() {return "meow";}
	
}
public class A{
	public static void main(String[] args) {
AD a = new B();
C c = (C)a;
System.out.println(c.noise());
	}
}