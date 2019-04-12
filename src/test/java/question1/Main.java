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
		Car car1 = new Car(100);
		Car car2 = new Car(200);
		
		Thread car1Runs = new Thread(car1);
		Thread car2Runs = new Thread(car2);
		
		car1Runs.start();
		car2Runs.start();
	}
}
