package sixtwentytwo;

public class Exercise6_22 {

	public boolean isNumber(String inputStr){
		
		int compare;
		
		for(int i = 0; i < inputStr.length(); i++){//inputStr에 담겨있는 것들을 모두 돌림
			compare = (int)(inputStr.charAt(i));
			
			//0~9 사이에 걸리는지 확인
			//아스키구나...!! 48~57 사이에 들어가는지 파악할 것 
			
			if(compare != 48&&compare != 49&&compare != 50&&compare != 51&&compare != 52&&compare != 53&&compare != 54&&compare != 55&&compare != 56&&compare != 57){
				return false;
			}
			

		}
		return true;
		
	}
	
}
