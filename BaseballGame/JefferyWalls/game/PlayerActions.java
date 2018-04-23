package game;

public class PlayerActions {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//array for batters 0 is for first 
	boolean[] batterarray = new boolean[4];
	int strike;
	int ball;
	boolean hit;
	
	
	
	
	public void batter() {
		while(PlayGame.first.getStatus() == "Batter") {
			if(hit == true ) {
				if((batterarray[0] == true) && (batterarray[1] == false) && (batterarray[2] == false) && (batterarray[3] == false) ) {
			
					batterarray[1] = true;
				
				}else if((batterarray[0] == true) && (batterarray[1] == true) && (batterarray[2] == false) && (batterarray[3] == false)) {
					batterarray[2] = true;
				}else if((batterarray[0] == true) && (batterarray[1] == true) && (batterarray[2] == true) && (batterarray[3] == false)) {
					batterarray[3] = true;
				}else if((batterarray[0] == true) && (batterarray[1] == true) && (batterarray[2] == true) && (batterarray[3] == true)) {
					batterarray[0] = false;
				}
				
			}	
		}
	}
	public void pitcher() {
		
	}

}
