package game;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
public class GameBackground extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launch();
		
	}
//	private Player1 first;
//	private Player1 second;
//	private String color1;
//	private String color2;
//	
//	
//	public GameBackground(Player1 name1, Player1 name2){
//		this.first = name1;
//		this.second = name2;
//		color1 = first.getPlayerColor();
//		color2 = second.getPlayerColor();
//	}
	
	
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
//		
		initializeAndShowStage(primaryStage);
	}
	
	public void initializeAndShowStage(Stage stage) {
		
		Scene field = new Scene(createPane(),1350,800);
		field.setFill(Color.GREEN);
		stage.setScene(field);
        stage.show();
    }
	
	
	
	public Pane createPane() {
		
		Font font = new Font("Arial", 50);
		Font score = new Font("Arial", 25);
		
		Image green = new Image("file:green.jpg");
		ImageView greenBackground = new ImageView();
		greenBackground.setImage(green);
		greenBackground.setFitHeight(800);
		greenBackground.setFitWidth(1350);
		

		Label firstname = new Label(StartMenu.session.first.getPlayerName());
		firstname.setLayoutX(100);
		firstname.setFont(font);
		firstname.setLayoutY(100);
		firstname.setTextFill(Color.valueOf(StartMenu.session.first.getPlayerColor()));
		
		Label secondname = new Label(StartMenu.session.second.getPlayerName());
		secondname.setLayoutX(1150);
		secondname.setLayoutY(100);
		secondname.setFont(font);
		secondname.setTextFill(Color.valueOf(StartMenu.session.second.getPlayerColor()));
		
		Label scoreLabel1 = new Label("Score");
		scoreLabel1.setLayoutX(100);
		scoreLabel1.setFont(score);
		scoreLabel1.setLayoutY(150);
		scoreLabel1.setTextFill(Color.valueOf(StartMenu.session.first.getPlayerColor()));
		
		Label firstScore = new Label(StartMenu.session.first.getScore());
		firstScore.setLayoutX(100);
		firstScore.setFont(score);
		firstScore.setLayoutY(175);
		firstScore.setTextFill(Color.valueOf(StartMenu.session.first.getPlayerColor()));
		
		Label scoreLabel2 = new Label("Score");
		scoreLabel2.setLayoutX(1150);
		scoreLabel2.setFont(score);
		scoreLabel2.setLayoutY(150);
		scoreLabel2.setTextFill(Color.valueOf(StartMenu.session.second.getPlayerColor()));
		
		Label secondScore = new Label(StartMenu.session.second.getScore());
		secondScore.setLayoutX(1150);
		secondScore.setFont(score);
		secondScore.setLayoutY(175);
		secondScore.setTextFill(Color.valueOf(StartMenu.session.second.getPlayerColor()));
		
		
		
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
		Line f1 = new Line();
		f1.setFill(Color.WHITESMOKE);
		f1.setStroke(Color.WHITESMOKE);
		f1.setStartX(825);
		f1.setStartY(420);
		f1.setEndX(1050);
		f1.setEndY(190);
		
		Line f2 = new Line();
		f2.setFill(Color.WHITESMOKE);
		f2.setStroke(Color.WHITESMOKE);
		f2.setStartX(450);
		f2.setStartY(420);
		f2.setEndX(250);
		f2.setEndY(190);
		
		Rectangle mound = new Rectangle(25,15);
		mound.setFill(Color.WHITE);
		mound.setLayoutX(625);
		mound.setLayoutY(425);
		
		Button start = new Button("Start pitch");
		start.setLayoutX(600);
		start.setLayoutY(700);
		
		Button restart = new Button("Restart");
		restart.setLayoutX(700);
		restart.setLayoutY(700);
		restart.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				try {
					restart();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
		Pane pane1 = new Pane();
		pane1.getChildren().addAll(greenBackground,restart,start,circle1,circle2,b1,b2,b3,b4,f1,f2,base1,base2,base3, base4,mound, firstname, secondname,scoreLabel1, scoreLabel2,firstScore,secondScore);
		
		
		return pane1;
	}
	Stage restart = new Stage();
	
	private void restart() throws Exception {
		Platform.setImplicitExit(false);
		
		StartMenu ap = new StartMenu();
		ap.primaryStage.close();
		
		
		ap.initializeAndShowStage(restart);
		ap.primaryStage.close();
		
	}
	
	public void endGame() {
		
	}
	
	
	
//	
//	public void backgroundview() {
//		System.out.println("Game on");
//		
//		System.out.println("Done");
//		launch();
//	}



	

}
