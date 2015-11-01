package thirdLabGame;

public class GameLevel3 extends GameLevel{

	private static GameLevel3 instance = new GameLevel3();
	
	private GameLevel3(){
	
	}
	
	public static GameLevel3 getinstance(){
		if(instance == null){
			instance = new GameLevel3();
		}
		return instance;
	}
	
	@Override
	public void simpleAttack() {
		System.out.println("level3 simple attack: �޷�~ �޷�~ �޷�~");
	}

	@Override
	public void turnAttack() {
		System.out.println("level3 turn attack: �ڵ������� �յ�������");
		
	}

	@Override
	public void flyingAttack() {
		System.out.println("level3 flying attack: �������� ��~~~");		
	}
}
