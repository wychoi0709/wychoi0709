package thirdLabGame;

public abstract class GameLevel {

	public abstract void simpleAttack();
	public abstract void turnAttack();
	public abstract void flyingAttack();
	
	public void play(){
		
		simpleAttack();
		turnAttack();
		flyingAttack();
		
	}
	
}
