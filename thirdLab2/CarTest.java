package thirdLab2;

import java.util.ArrayList;

public class CarTest {

	public static void main(String[] args) {
		
		ArrayList<Car> list = new ArrayList<Car>();
		
		Car sonata1 =  new Sonata();
		Car genesis1 =  new Genesis();
		Car grandeur1 =  new Grandeur();
		Car avante1 =  new Avante();
		
		list.add(sonata1);
		list.add(genesis1);
		list.add(grandeur1);
		list.add(avante1);
		
		for(int i=0; i<list.size(); i++){
			if(list.get(i) instanceof Sonata){
				Sonata sonata = (Sonata)list.get(i);
				sonata.carMove();
			}else if(list.get(i) instanceof Genesis){
				Genesis genesis = (Genesis)list.get(i);
				genesis.carMove();
			}else if(list.get(i) instanceof Grandeur){
				Grandeur grandeur = (Grandeur)list.get(i);
				grandeur.carMove();
			}else if(list.get(i) instanceof Avante){
				Avante avante = (Avante)list.get(i);
				avante.carMove();
			}
		}
		
	}
	
}
