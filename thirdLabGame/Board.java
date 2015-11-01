package thirdLabGame;

public class Board {

	public static void main(String[] args) {
		
		Player player = new Player();
		
		System.out.println("=============Level 1 start=============");
		player.attack();
		System.out.println("==============Level 1 end==============");
		System.out.println(" ");
		System.out.println("=============Level 2 start=============");
		player.upgradeLevel();
		player.attack();
		System.out.println("==============Level 2 end==============");
		System.out.println(" ");
		System.out.println("=============Level 3 start=============");
		player.upgradeLevel();
		player.attack();
		System.out.println("==============Level 3 end==============");
	}
	
}
