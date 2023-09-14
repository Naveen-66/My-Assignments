package Week1.day1;

public class Car {
	
	public void applyGear() {
		System.out.println("applyGear");
	}
	public void applyAccelerate() {
		System.out.println("apply Accelerate");
	}
	public void switchOnAc() {
		System.out.println("Switch On Ac");
}
	public static void main(String[] args) {
		Car car=new Car();
		car.applyGear();
		car.applyAccelerate();
		car.switchOnAc();
	}

}

