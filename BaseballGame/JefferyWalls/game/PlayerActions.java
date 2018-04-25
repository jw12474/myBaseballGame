package game;

public class PlayerActions {
	
	

	
	
	//array for batters 0 is for first 
	boolean[] batterarray = new boolean[4];
	private int strike = 0;
	int ball;
	boolean hit;
	
	
	
	
	
	public void batter() {
		if(StartMenu.session.first.getStatus() == "Batter") {
			while(StartMenu.session.first.getStatus() == "Batter") {
				if(hit == true ) {
					if((batterarray[0] == true) && (batterarray[1] == false) && (batterarray[2] == false) && (batterarray[3] == false) ) {
				
						batterarray[1] = true;
					
					}else if((batterarray[0] == true) && (batterarray[1] == true) && (batterarray[2] == false) && (batterarray[3] == false)) {
						batterarray[2] = true;
					}else if((batterarray[0] == true) && (batterarray[1] == true) && (batterarray[2] == true) && (batterarray[3] == false)) {
						batterarray[3] = true;
					}else if((batterarray[0] == true) && (batterarray[1] == true) && (batterarray[2] == true) && (batterarray[3] == true)) {
						batterarray[0] = false;
						StartMenu.session.first.addToScore();
					}
				
				}else {
					StartMenu.session.first.addToStrike();
					strike++;
				}
				if(strike == 3) {
					StartMenu.session.first.setStatus("Pitcher");
				}
			}
		} else if(StartMenu.session.second.getStatus() == "Batter") {
			while(StartMenu.session.second.getStatus() == "Batter") {
				if(hit == false) {
					strike++;
				}
				if(strike == 3) {
					StartMenu.session.second.addToOut();
				
				}
				if(hit == true ) {
					if((batterarray[0] == false) && (batterarray[1] == false) && (batterarray[2] == false) && (batterarray[3] == false) ) {
				
						batterarray[0] = true;
					
					}else if((batterarray[0] == true) && (batterarray[1] == false) && (batterarray[2] == false) && (batterarray[3] == false) ) {
				
						batterarray[1] = true;
					
					}else if((batterarray[0] == true) && (batterarray[1] == true) && (batterarray[2] == false) && (batterarray[3] == false)) {
						batterarray[2] = true;
					}else if((batterarray[0] == true) && (batterarray[1] == true) && (batterarray[2] == true) && (batterarray[3] == false)) {
						batterarray[3] = true;
					}else if((batterarray[0] == true) && (batterarray[1] == true) && (batterarray[2] == true) && (batterarray[3] == true)) {
						batterarray[0] = false;
						StartMenu.session.second.addToScore();
					}
				
				}else {
					StartMenu.session.second.addToStrike();
					strike++;
				}
				if(strike == 3) {
					StartMenu.session.second.setStatus("Pitcher");
				}
		}
	
	}
	public void pitcher() {
		
	}
	
	

}
