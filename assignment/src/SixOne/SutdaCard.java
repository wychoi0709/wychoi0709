
package SixOne;



public class SutdaCard {
	
	int num;
	boolean isKwang;
	String k;

	public SutdaCard(){
		num = 1;
		k = "K";
	}
	
	public SutdaCard(int num, boolean isKwang){
		
		this.num = num;
		this.isKwang = isKwang;
		k ="";
	}
	
	public String info(){
		return num + k;
	}
	
}
