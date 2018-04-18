package game;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
public class GameBackground extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launch();
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Rectangle background = new Rectangle();
		background.setLayoutX(500);
		background.setLayoutY(450);
		background.setScaleX(1000);
		background.setScaleY(900);
		background.setFill(Color.GREEN);
		
		
		Pane pane1 = new Pane();
		pane1.getChildren().add(background);
		
		Scene scene1 = new Scene(pane1, 1000, 900 );
		primaryStage.setTitle("Play Baseball");
		primaryStage.setScene(scene1);
		primaryStage.show();
	}

}
