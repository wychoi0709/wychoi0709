package sixsix;

public class Exercise6_6 {

	public double getDistance(int x, int y, int x1, int y1){
		
		double distance1;
		double distance2;
		double result;
		
		distance1 = x-x1;
		distance2 = y-y1;
		
		if(distance1 < 0){
			distance1 *= -1; 
		}
		
		if(distance2 < 0){
			distance2 *= -1; 
		}
		
		result = Math.pow(distance1, 2) + Math.pow(distance2, 2);
		result = Math.pow(result, 0.5);
		return result;
		
	}
	
}
