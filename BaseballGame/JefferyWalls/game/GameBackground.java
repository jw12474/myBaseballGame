package game;
import javafx.application.Application;
import javafx.scene.Scene;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
public class GameBackground extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launch();
		
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Rectangle base1 = new Rectangle(25,25);
		base1.setFill(Color.WHITE);
		base1.setLayoutX(625);
		base1.setLayoutY(600);
		
		Rectangle base2 = new Rectangle(25,25);
		base2.setFill(Color.WHITE);
		base2.setLayoutX(775);
		base2.setLayoutY(420);
		
		Rectangle base3 = new Rectangle(25,25);
		base3.setFill(Color.WHITE);
		
		
		Circle circle1 = new Circle(40);
		circle1.setLayoutX(638);
		circle1.setLayoutY(610);
		circle1.setFill(Color.valueOf("#996633"));
		
		Rectangle mound = new Rectangle(25,15);
		mound.setFill(Color.WHITE);
		mound.setLayoutX(625);
		mound.setLayoutY(425);
		
		Pane pane1 = new Pane();
		pane1.getChildren().addAll(circle1,base1,base2,mound);
		
		Scene scene1 = new Scene(pane1, 1250, 800 );
		scene1.setFill(Color.GREEN);
		primaryStage.setTitle("Play Baseball");
		primaryStage.setScene(scene1);
		primaryStage.show();
	}
	
	
	
//	public void backgroundview() {
//		launch();
//	}

}
