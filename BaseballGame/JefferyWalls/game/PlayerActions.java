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
					StartMenu.session.first.addToOutForBatter();
					
					}
			}else if(hit == true ) {
						if((batterarray[0] == false) && (batterarray[1] == false) && (batterarray[2] == false) && (batterarray[3] == false) ) {
							batterarray[0] = true;
						}else if((batterarray[0] == true) && (batterarray[1] == false) && (batterarray[2] == false) && (batterarray[3] == false) ) {
							batterarray[1] = true;
						}else if((batterarray[0] == true) && (batterarray[1] == true) && (batterarray[2] == false) && (batterarray[3] == false)) {
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
						StartMenu.session.second.addToOutForBatter();
						pitcher();
						strike = 0;
				
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
		String pitcher = "";
		if(StartMenu.session.second.getStatus() == "Batter") {
			pitcher = StartMenu.session.first.getPlayerName();
		}else if(StartMenu.session.first.getStatus() == "Batter"){
			pitcher = StartMenu.session.second.getPlayerName();
		}
		System.out.println("strike count is " + strike);
		System.out.println("The pitcher is " + pitcher);
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
