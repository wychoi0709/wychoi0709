package thirdLab2;

public class Genesis extends Car{
	
	@Override
	public void start() {
		System.out.println("start() Genesis");
	}

	@Override
	public void drive() {
		System.out.println("drive() Genesis");		
	}

	@Override
	public void stop() {
		System.out.println("stop() Genesis");		
	}

	@Override
	public void turnoff() {
		System.out.println("turnoff() Genesis");		
	}

	@Override
	public void washCar() {
		System.out.println("washCar() Genesis");		
	}

}
