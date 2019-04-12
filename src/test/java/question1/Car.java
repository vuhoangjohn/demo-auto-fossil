package question1;


public class Car implements Runnable {
	private int wheels = 4;
	private int doors = 4;
	private int seats = 5;
	private int maxSpeed;
	
	public Car(int maxSpeed) {
		super();
		this.maxSpeed = maxSpeed;
	}
	
	public Car() {
		super();
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public synchronized void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Max Speed: " + this.getMaxSpeed());
		}
	}
	
	public void info() {
		System.out.println("Wheel(s): " + this.wheels);
		System.out.println("Door(s): " + this.doors);
		System.out.println("Seat(s): " + this.seats);
		System.out.println("maxSpeed(s): " + this.maxSpeed);
	}


	
}
