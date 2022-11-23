package Hi;

public class AnonymousClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl ac = new RemoteControl(){
			public void turnOn() {
				System.out.println("tv turnon()");
			}
			public void turnOff() {
				System.out.println("tv turnOff()");
			}
			
		};
		ac.turnOn();
		ac.turnOff();

	}

}
