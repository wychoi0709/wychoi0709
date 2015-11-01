package thirdLabGame;

import java.util.ArrayList;


public class Player {

	int level=0;
	ArrayList<GameLevel> GameList = new ArrayList<GameLevel>();
	
	public void upgradeLevel(){
		level++;
	}
	
	public void getGameLevel(){
		GameLevel gameLevel1 = GameLevel1.getinstance();
		GameLevel gameLevel2 = GameLevel2.getinstance();
		GameLevel gameLevel3 = GameLevel3.getinstance();
		
		GameList.add(gameLevel1);
		GameList.add(gameLevel2);
		GameList.add(gameLevel3);
	
		GameList.get(level).play();
	}
	
	public void attack(){
		getGameLevel();
	}
	
}
