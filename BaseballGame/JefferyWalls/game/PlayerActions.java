package game;

public class PlayerActions {
	
	

	
	
	//array for batters 0 is for first 
	public boolean[] batterarray = new boolean[3];
	private int strike = 0;
	int ball;
	
	
	
	
	public void determineHit(int player1num, int player2num) {
		
		int batter = 0;
		int pitcher = 0;
		int luck1= StartMenu.session.first.getLuck();
		int luck2= StartMenu.session.second.getLuck();
		boolean hit;
		int rand = (int)(Math.random() * ((99 - 59) +1 )+ 59);
		//we have to determine who is the batter 
		if(StartMenu.session.first.getStatus() == "Batter") {
			batter = player1num;
			
			batter = batter + luck1; 
			pitcher = player2num;
			
			pitcher = pitcher + luck2;
			
		}else if(StartMenu.session.first.getStatus() == "Pitcher") {
			batter = player2num;
			batter = batter + luck2;
			pitcher = player1num;
			pitcher = pitcher + luck1;
		}
		
		if((batter - pitcher) >= rand ) {
			hit = true;
		}else {
			hit = false;
		}
		System.out.println("The hit is " + hit);
		batter(hit);
	}
	
	
	public void batter(boolean hit) {
		if(StartMenu.session.first.getStatus() == "Batter") {
			if(hit == false) {
				strike++;
				if(strike == 3) {
					System.out.println("Strike count got to three it is now back to zero");
					StartMenu.session.first.addToOutForBatter();
					
					batterarray[0] = false;
					batterarray[1] = false;
					batterarray[2] = false;
					strike = 0;
				}
				if(StartMenu.session.first.getOut()== 3) {
					pitcher();
				}
			}else if(hit == true ) {
						if((batterarray[0] == false) && (batterarray[1] == false) && (batterarray[2] == false)  ) {
							batterarray[0] = true;
							
						}else if((batterarray[0] == true) && (batterarray[1] == false) && (batterarray[2] == false) ) {
							batterarray[1] = true;
						}else if((batterarray[0] == true) && (batterarray[1] == true) && (batterarray[2] == false) ) {
							batterarray[2] = true;
						}else if((batterarray[0] == true) && (batterarray[1] == true) && (batterarray[2] == true)) {
							StartMenu.session.first.addToScore();
						}else if(batterarray[0] == true) {
							batterarray[1] = true;
							batterarray[0] = true;
						} else if(batterarray[1] = true) {
							batterarray[2] = true;
							batterarray[1] = false;
							
						} else if(batterarray[2] = true) {
							batterarray[2] = false;
							StartMenu.session.first.addToScore();
						}
				
				}
					
			}else if(StartMenu.session.second.getStatus() == "Batter") {
				if(hit == false) {
					strike++;			
					if(strike == 3) {
						System.out.println("Strike count got to three it is now back to zero");
						StartMenu.session.second.addToOutForBatter();
						pitcher();
						strike = 0;
						batterarray[0] = false;
						batterarray[1] = false;
						batterarray[2] = false;
						strike = 0;
				
					}
					if(StartMenu.session.first.getOut()== 3) {
						pitcher();
					}
				}else if(hit == true ) {
							if((batterarray[0] == false) && (batterarray[1] == false) && (batterarray[2] == false)  ) {
					
								batterarray[0] = true;
							
							}else if((batterarray[0] == true) && (batterarray[1] == false) && (batterarray[2] == false)  ) {
						
								batterarray[1] = true;
							
							}else if((batterarray[0] == true) && (batterarray[1] == true) && (batterarray[2] == false) ) {
								batterarray[2] = true;
							}else if((batterarray[0] == true) && (batterarray[1] == true) && (batterarray[2] == true)) {
								StartMenu.session.second.addToScore();
							}else if(batterarray[0] == true) {
								batterarray[1] = true;
								batterarray[0] = true;
							} else if(batterarray[1] = true) {
								batterarray[2] = true;
								batterarray[1] = false;
								
							} else if(batterarray[2] = true) {
								batterarray[2] = false;
								StartMenu.session.second.addToScore();
							} 
					
						}
				
				}
		for(int i = 0; i<batterarray.length -1;i++) {
			GameBackground.createPlayer(i, batterarray[i]);
		}
		String pitcher = "";
		int out = 0;
		if(StartMenu.session.second.getStatus() == "Batter") {
			pitcher = StartMenu.session.first.getPlayerName();
			out = StartMenu.session.second.getOut();
		}else if(StartMenu.session.first.getStatus() == "Batter"){
			pitcher = StartMenu.session.second.getPlayerName();
			out = StartMenu.session.first.getOut();

		}
		System.out.println("strike count is " + strike);
		System.out.println("The pitcher is " + pitcher);
		System.out.println("player 1 score is " + StartMenu.session.first.getIntScore());
		System.out.println("player 2 score is " + StartMenu.session.second.getIntScore());
		System.out.println("the round is " + StartMenu.session.getRound());
		System.out.println("the Out count is " + out);
		GameBackground newGame = new GameBackground();
		newGame.secondScore.setText(StartMenu.session.second.getScore());
		newGame.firstScore.setText(StartMenu.session.first.getScore());
		newGame.roundNum.setText(StartMenu.session.getRound());
		GameBackground.b0player.setVisible(batterarray[0]);
		GameBackground.b1player.setVisible(batterarray[1]);
		GameBackground.b2player.setVisible(batterarray[2]);
		newGame.showGameBackground(StartMenu.primaryStage);
		

		
		
	}
	
	
	
	//may happen today used to change who is pitcher color on mound
	public void pitcher() {
		if(StartMenu.session.first.getStatus() == "Pitcher") {
			StartMenu.session.first.setStatus("Batter");
			StartMenu.session.second.setStatus("Pitcher");
		}else if(StartMenu.session.second.getStatus() == "Pitcher") {
			StartMenu.session.first.setStatus("Pitcher");
			StartMenu.session.second.setStatus("Batter");
			
			
		}
		
	}
	
	

}
