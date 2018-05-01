package game;
import java.util.concurrent.TimeUnit;

import javafx.application.Platform;

public class PlayGame  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Player1 first;
	public Player1 second;
	private int round = 1;
//	private int strikeCount;
//	
	public PlayGame(Player1 firstPlayer, Player1 secondPlayer) {
		first = firstPlayer;
		second = secondPlayer;
	}
	
	
	
	
	
	public void playBall(){
		System.out.println("Playball!");
		
	}
	
	public void addToRound() throws InterruptedException {
		round++;
		if(round == 5) {
			gameEnd();
			
		}
		
	}
	
	public void gameEnd() throws InterruptedException {
		int score1 = StartMenu.session.first.getIntScore();
			int score2 = StartMenu.session.second.getIntScore();
			if(score1>score2) {
				GameBackground app = new GameBackground();
				app.endGame();
				
			}
	}
	
	public String getRound() {
		return Integer.toString(round) ;
	}


	

}
