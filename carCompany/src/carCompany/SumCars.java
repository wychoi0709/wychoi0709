package carCompany;

public class SumCars {
	public void sum(){
		Car[] carList = new Car[3];
		carList[0] = new Sonata();
		carList[1] = new Genesis();
		carList[2] = new Grandeur();
		
		int sumPrice = 0;
		
		for(int i=0; i<carList.length; i++){
			carList[i].car();
			sumPrice = sumPrice + (carList[i].price * carList[i].quantity);
		}
		System.out.println(" ");
		System.out.println("��� ���� ���ݰ� ������ ����� ������ " + sumPrice +"�� �Դϴ�");
	}
}
