package question1;

/*
 * AUTHOR: VUHOANG
 */
public class Main {
	public static void main(String[] args) {
//		question1();
//		question2();
		question3();
	}
	
	static void question1() {
		Car toyotaCar = new ToyotaCar();
		
		Car bmwCar = new BMWCar();
		
		System.out.println("Toyota Car runs: ");
		toyotaCar.run();
		
		System.out.println("BMW Car runs: ");
		bmwCar.run();
	}
	
	static void question2() {
		Car toyotaCar = new ToyotaCar();
		Car bmwCar = new BMWCar();
		
		Thread toyotaCarRun = new Thread(toyotaCar);
		Thread bmwCarRun = new Thread(bmwCar);
		
		toyotaCarRun.start();
		try {
			toyotaCarRun.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		bmwCarRun.start();
		try {
			bmwCarRun.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	static void question3() {
	}
}
