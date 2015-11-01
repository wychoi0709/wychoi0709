package thirdLab2;

public class Sonata extends Car{

	@Override
	public void start() {
		System.out.println("start() Sonata");
	}

	@Override
	public void drive() {
		System.out.println("drive() Sonata");		
	}

	@Override
	public void stop() {
		System.out.println("stop() Sonata");		
	}

	@Override
	public void turnoff() {
		System.out.println("turnoff() Sonata");		
	}

	@Override
	public void washCar() {
		System.out.println("washCar() Sonata");		
	}

}
