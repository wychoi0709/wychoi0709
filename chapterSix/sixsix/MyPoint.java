package sixsix;

public class MyPoint {

	int x;
	int y;
	
	public MyPoint(int x, int y){
		
		this.x = x;
		this.y = y;
		
	}
	
	public double getDistance(int x1,int y1){
		Exercise6_6 ex = new Exercise6_6();
		return ex.getDistance(x, y, x1, y1);
	}
	
}
