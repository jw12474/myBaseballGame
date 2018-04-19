package game;

public class Player1  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private String playerColor;
	private String playerName;
	private int luck;
	private boolean question;
	public Player1(String name, String color, boolean question) {
		playerName = name;
		playerColor = color;
		this.question = question;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	public String getPlayerColor() {
		return playerColor;
	}
	
	
	private void setLuck() {
		int rand = 0;
		luck = 0;
		if(question) {
			rand = (int)(Math.random() * ((99 - 1) +1 ));
			luck = rand+7;
		} else {
			rand = (int)(Math.random() * ((69 - 1) +1 ));
			luck = rand - 1;
		}
		
	}
	
	public int getLuck() {
		setLuck();
		//temp test
		System.out.println(luck);
		return luck;
		
	}

}
