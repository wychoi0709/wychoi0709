package thirdLabGame;

public class GameLevel1 extends GameLevel{
	
	private static GameLevel1 instance = new GameLevel1();

	private GameLevel1(){
	
	}
	
	public static GameLevel1 getinstance(){
		if(instance == null){
			instance = new GameLevel1();
		}
		return instance;
	}

	@Override
	public void simpleAttack() {
		System.out.println("level1 simple attack: ¸Ş·Õ~~~");
	}

	@Override
	public void turnAttack() {
		System.out.println("level1 turn attack: ¸øÇÏÁö·Õ");
		
	}

	@Override
	public void flyingAttack() {
		System.out.println("level1 flying attack: ÀÌ°Íµµ ¸øÇÏÁö·Õ");		
	}

}
