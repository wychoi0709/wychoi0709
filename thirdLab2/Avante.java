package thirdLab2;

public class Avante extends Car{
	
	@Override
	public void start() {
		System.out.println("start() Avante");
	}

	@Override
	public void drive() {
		System.out.println("drive() Avante");		
	}

	@Override
	public void stop() {
		System.out.println("stop() Avante");		
	}

	@Override
	public void turnoff() {
		System.out.println("turnoff() Avante");		
	}

	@Override
	public void washCar() {
		System.out.println("washCar() Avante");		
	}


}
