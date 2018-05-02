package game;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.Pane;



public class battingPitching  {

	
	
	
	public Scene slider() {
		Label player1Name = new Label(StartMenu.session.first.getPlayerName());
		Label player2Name = new Label(StartMenu.session.second.getPlayerName());
		player1Name.setLayoutX(100);
		player2Name.setLayoutX(300);
		player1Name.setLayoutY(100);
		player2Name.setLayoutY(100);
		Label pitch = new Label("Pitcher"); 
		Slider player1 = new Slider();
		player1.setLayoutX(100);
		player1.setLayoutY(200);
		player1.setOrientation(Orientation.VERTICAL);
		
		Slider player2 = new Slider();
		player2.setLayoutX(300);
		player2.setLayoutY(200);
		player2.setOrientation(Orientation.VERTICAL);
		if(StartMenu.session.first.getStatus() == "Pitcher") {
			player1.setMax(25);
			pitch.setLayoutX(100);
			player2.setMax(100);
			
		}else if(StartMenu.session.second.getStatus() == "Pitcher") {
			player2.setMax(25);
			pitch.setLayoutX(300);
			player1.setMax(100);
		}
		pitch.setLayoutY(150);
		
		
		
		Label bat = new Label("Batter");
		if(StartMenu.session.first.getStatus() == "Batter") {
			
			bat.setLayoutX(100);
		}else if(StartMenu.session.second.getStatus() == "Batter") {
			
			bat.setLayoutX(300);
		}
		bat.setLayoutY(150);
		
		
		
		//set numbers to the sliders
		player1.setMin(0);
		
		player2.setMin(0);
		
		Label instruction = new Label("Place slider at level you want then when both are ready press Done");
		instruction.setLayoutX(100);
		instruction.setLayoutY(10);
		
		Button done = new Button("Done");
		done.setLayoutX(245);
		done.setLayoutY(350);
		done.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				int play1 = (int) player1.getValue();
				int play2 = (int) player2.getValue();
				slidersDone(play1,play2);
				
			}
			
		});
		
		Pane pane = new Pane();
		pane.getChildren().addAll(instruction,player1Name,player2Name,player1,player2,bat,pitch,done);
		Scene scene = new Scene(pane, 500, 400 );
		
		return scene;
	}
	
	public void startPitch() {
			
			GameBackground.sliders.setScene(slider());
			
			GameBackground.sliders.show();
			
			
		}
	
	
	private void slidersDone(int player1, int player2) {
		GameBackground.playBall.determineHit(player1, player2);
		
		GameBackground.sliders.close();
	}
}
