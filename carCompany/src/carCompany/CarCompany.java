package carCompany;

public class CarCompany {
	private static CarCompany carCompany = new CarCompany();
	
	private CarCompany(){
		System.out.println("�ڵ��� ȸ�翹��.");
		System.out.println(" ");
	}
	
	public void sum(){
		SumCars sumCar = new SumCars();
		sumCar.sum();
	}
	
	public static CarCompany getInstance(){
		if(carCompany == null){
			carCompany = new CarCompany();
		}
		
		return carCompany;
	}
}
