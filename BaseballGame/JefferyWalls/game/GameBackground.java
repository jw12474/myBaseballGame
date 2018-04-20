package game;
import javafx.application.Application;
import javafx.scene.Scene;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Path;
import javafx.scene.shape.QuadCurveTo;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
public class GameBackground extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launch();
		
	}
	
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//bases for refrence points to run for in the other code 
		Rectangle base1 = new Rectangle(25,25);
		base1.setFill(Color.WHITE);
		base1.setLayoutX(625);
		base1.setLayoutY(600);
		
		Rectangle base2 = new Rectangle(25,25);
		base2.setFill(Color.WHITE);
		base2.setLayoutX(800);
		base2.setLayoutY(420);
		
		Rectangle base3 = new Rectangle(25,25);
		base3.setFill(Color.WHITE);
		base3.setLayoutX(625);
		base3.setLayoutY(250);
		
		Rectangle base4 = new Rectangle(25,25);
		base4.setFill(Color.WHITE);
		base4.setLayoutX(450);
		base4.setLayoutY(420);
		
		
		//dirt spots for the mound and for home base
		Circle circle1 = new Circle(40);
		circle1.setLayoutX(638);
		circle1.setLayoutY(610);
		circle1.setFill(Color.valueOf("#996633"));
		
		Circle circle2 = new Circle(40);
		circle2.setLayoutX(638);
		circle2.setLayoutY(435);
		circle2.setFill(Color.valueOf("#996633"));
		
		
		//need to make lines in between bases and foul lines
		Line b1 = new Line();
		b1.setFill(Color.WHITESMOKE);
		b1.setStroke(Color.WHITESMOKE);
		b1.setStartX(650);
		b1.setStartY(600);
		b1.setEndX(825);
		b1.setEndY(420);
		
		Line b2 = new Line();
		b2.setFill(Color.WHITESMOKE);
		b2.setStroke(Color.WHITESMOKE);
		b2.setStartX(800);
		b2.setStartY(420);
		b2.setEndX(625);
		b2.setEndY(250);
		
		Line b3 = new Line();
		b3.setFill(Color.WHITESMOKE);
		b3.setStroke(Color.WHITESMOKE);
		b3.setStartX(625);
		b3.setStartY(275);
		b3.setEndX(475);
		b3.setEndY(420);
		
		Line b4 = new Line();
		b4.setFill(Color.WHITESMOKE);
		b4.setStroke(Color.WHITESMOKE);
		b4.setStartX(475);
		b4.setStartY(445);
		b4.setEndX(625);
		b4.setEndY(600);
		
		//foul line
		;
		
				
		
		Rectangle mound = new Rectangle(25,15);
		mound.setFill(Color.WHITE);
		mound.setLayoutX(625);
		mound.setLayoutY(425);
		
		Pane pane1 = new Pane();
		pane1.getChildren().addAll(circle1,circle2,b1,b2,b3,b4,base1,base2,base3, base4,mound);
		
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
