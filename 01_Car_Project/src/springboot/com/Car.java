package springboot.com;

public class Car {
	
	public void drive() {
		Engine engine = new Engine();
		int status = engine.start();
		if (status >=1) {
			System.out.println("Your Journey Stared");
		} else {
			System.out.println("Your Car Engine some Problem");
		}
		
	}

}
