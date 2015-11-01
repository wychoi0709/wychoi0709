package thirdLab2;

public class Grandeur extends Car{
	
	@Override
	public void start() {
		System.out.println("start() Grandeur");
	}

	@Override
	public void drive() {
		System.out.println("drive() Grandeur");		
	}

	@Override
	public void stop() {
		System.out.println("stop() Grandeur");		
	}

	@Override
	public void turnoff() {
		System.out.println("turnoff() Grandeur");		
	}

	@Override
	public void washCar() {
		System.out.println("washCar() Grandeur");		
	}

}
