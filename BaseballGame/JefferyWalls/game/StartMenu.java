package game;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;
public class StartMenu extends Application {

	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launch();
	}
	Stage primaryStage= new Stage();

	@Override
public void start(Stage primaryStage) throws Exception {
		
//		
		initializeAndShowStage(this.primaryStage);
	}
	
	public void initializeAndShowStage(Stage stage) {
        stage.setScene(createScene());
        stage.show();
    }
	
	
	public void showGameBackground(Stage stage) {
		GameBackground app = new GameBackground();
		Pane field = new Pane(app.createPane());
		Scene background = new Scene(field,1350,800);
		background.setFill(Color.GREEN);
		stage.setScene(background);
		stage.show();
	}
	//Stage secondStage = new Stage();
	
	
	public Scene createScene() {
		Label player1Label = new Label("Player 1");
		player1Label.setLayoutX(60);
		player1Label.setLayoutY(30);
		
		Label player2Label = new Label("Player 2");
		player2Label.setLayoutX(260);
		player2Label.setLayoutY(30);
		
		TextField player1 = new TextField();
		player1.setLayoutX(30);
		player1.setLayoutY(50);
		
		TextField player2 = new TextField();
		player2.setLayoutX(230);
		player2.setLayoutY(50);
		
		Label player1color = new Label("Player 1 Color");
		player1color.setLayoutX(60);
		player1color.setLayoutY(80);
		
		Label player2color = new Label("Player 2 Color");
		player2color.setLayoutX(260);
		player2color.setLayoutY(80);
		
		ObservableList<String> colors = FXCollections.observableArrayList("BLUE", "RED", "BLACK", "GREEN");
		ComboBox<String> p1DpBox = new ComboBox<String>();
		p1DpBox.setItems(colors);
		p1DpBox.setLayoutX(30);
		p1DpBox.setLayoutY(100);
		
		ComboBox<String> p2DpBox = new ComboBox<String>();
		p2DpBox.setItems(colors);
		p2DpBox.setLayoutX(230);
		p2DpBox.setLayoutY(100);
		//people who don't like pineapple on pizza don't deserve to win
		Label player1question = new Label("Do you like pineapple on pizza");
		player1question.setLayoutX(20);
		player1question.setLayoutY(130);
		
		Label player2question = new Label("Do you like pineapple on pizza");
		player2question.setLayoutX(220);
		player2question.setLayoutY(130);
		
		ToggleGroup group1 = new ToggleGroup();
		ToggleGroup group2 = new ToggleGroup();
		
		RadioButton player1btn1 = new RadioButton("YES");
		player1btn1.setLayoutX(20);
		player1btn1.setLayoutY(160);
		player1btn1.setToggleGroup(group1);
		
		RadioButton player1btn2 = new RadioButton("No");
		player1btn2.setLayoutX(70);
		player1btn2.setLayoutY(160);
		player1btn2.setToggleGroup(group1);
		
		RadioButton player2btn1 = new RadioButton("YES");
		player2btn1.setLayoutX(220);
		player2btn1.setLayoutY(160);
		player2btn1.setToggleGroup(group2);
		
		RadioButton player2btn2 = new RadioButton("No");
		player2btn2.setLayoutY(160);
		player2btn2.setLayoutX(270);
		player2btn2.setToggleGroup(group2);
		
		Button start = new Button("Start");
		start.setLayoutX(180);
		start.setLayoutY(200);
		start.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				String player1S = player1.getText();
				String player2s = player2.getText();
				String p1DpBoxs = p1DpBox.getValue();
				String p2DpBoxs = p2DpBox.getValue();
				boolean player1questions;
				if(group1.getUserData() == "YES") { player1questions = true;} else { player1questions = false;}
				boolean player2questions;
				if(group1.getUserData() == "YES") {player2questions = true;} else {player2questions = false;}
				
				
					try {
						btnClick(player1S, player2s, p1DpBoxs, p2DpBoxs, player1questions, player2questions);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
					// TODO Auto-generated catch block
					
				}
			
			
		});
		
		Pane pane1 = new Pane();
		pane1.getChildren().addAll(player1Label,player2Label,player1,player2,p1DpBox, p2DpBox,player1color,player2color,player1question,player2question,player1btn1,player1btn2,player2btn1,player2btn2,start);
		Scene scene1 = new Scene(pane1, 400, 250 );
		
		return scene1;
	}

	//variables for players for the next class to use
	private String player1Name;
	private String player2Name;
	private String player1Color;
	private String player2Color;
	private boolean answer1;
	private boolean answer2;
	private Player1 first;
	private Player1 second;
	public static PlayGame session; 
	
	public void btnClick(String player1,String  player2, String p1DpBox, String p2DpBox, boolean player1question, boolean player2question) throws Exception {
		player1Name =  player1;
		player2Name = player2;
		player1Color = p1DpBox;
		player2Color = p2DpBox;
		answer1 = player1question;
		answer2 = player2question;
		
		Player1 first = new Player1(player1Name, player1Color, answer1);
		Player1 second = new Player1(player2Name, player2Color, answer2);
		
		session = new PlayGame(first, second);
		
		showGameBackground(primaryStage);
		
		
		
	}
	
	

	
	

	
	

}
