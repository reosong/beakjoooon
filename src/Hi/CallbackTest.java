package Hi;

public class CallbackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Timer t = new Timer(1000,event -> System.out.println("beep"));
		t.start();
		
		for(int i =0; i <1000; i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e)
		}
	}

}
