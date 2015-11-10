package sixtwenty;

public class Excercise6_20 {

	public int[] shuffle(int[] ints){
		
		for(int i=0; i<ints.length; i++){
			int rand1 = (int)(Math.random()*ints.length);
			int rand2 = (int)(Math.random()*ints.length);

			int temp1;
			int temp2;
			
			temp1 = ints[rand1];
			temp2 = ints[rand2];
			
			ints[rand2] = temp1;
			ints[rand1] = temp2;
			
		}
		
		
		return ints;
	}
	
}
