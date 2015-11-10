package sixtwentythree;

public class Excercise6_23 {
	int compare = 0;

	public int max(int[] arr){

		if(arr.length == 0){
			return -999999;
		}
		
		compare = arr[0];
		
		for(int i =0; i < arr.length; i++){
			
			if(arr[i]>compare){
				compare = arr[i];
			}
			
		}
				
		return compare;
		
	}
	
	
	//null을 잡기 위해서 오버로딩을 했으나 안잡히고 자꾸 자바 애러가......쿨럭ㅠ
	public int max(Object arr){
		if(arr == null){
			return -999999;
		}
		return 0;
	}
	
}
