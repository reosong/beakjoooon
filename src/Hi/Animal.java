package Hi;

public class Animal {
	double weight;
	String picture;
	
	void eat() { 
		System.out.println("eat()가 호출되었음 ");
	}
	void sleep() {
		System.out.println("sleep()가 호출되었음 ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lion lion = new Lion();
		lion.eat();
		lion.sleep();
		lion.roar();
		
		Eagle eagle = new Eagle();
		eagle.eat();
		eagle.sleep();
		eagle.fly();
		

	}

}
