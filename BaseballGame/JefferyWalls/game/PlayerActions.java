package game;

public class PlayerActions {
	
	

	
	
	//array for batters 0 is for first 
	public boolean[] batterarray = new boolean[3];
	private int strike = 0;
	int ball;
	
	
	
	
	
	
	public void batter(boolean hit) {
		if(StartMenu.session.first.getStatus() == "Batter") {
			while(StartMenu.session.first.getStatus() == "Batter") {
				if(hit == false) {
					strike++;
					if(strike == 3) {
						StartMenu.session.first.addToOut();
						if(StartMenu.session.first.getOut() == 3) {
							StartMenu.session.first.setStatus("Pitcher");
							try {
								StartMenu.session.addToRound();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
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
					
				}
			}else if(StartMenu.session.second.getStatus() == "Batter") {
				while(StartMenu.session.second.getStatus() == "Batter") {
					if(hit == false) {
						strike++;
					}
					if(strike == 3) {
						StartMenu.session.second.addToOut();
				
					} if(StartMenu.session.second.getOut() == 3) {
						StartMenu.session.second.setStatus("Pitcher");
						try {
							StartMenu.session.addToRound();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
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
			}
		}
	
	
	
	//may happen today used to change who is pitcher color on mound
	public void pitcher() {
		
	}
	
	

}
