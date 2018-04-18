package game;

public class Player1 extends StartMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private String playerColor;
	private String playerName;
	public Player1(String name, String color) {
		playerName = name;
		playerColor = color;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	public String getPlayerColor() {
		return playerColor;
	}

}
