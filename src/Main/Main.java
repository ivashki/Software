package Main;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import Àppearance.LoadCustomImage;

public class Main extends Application {

	Stage window;
	Button button;
	private Stage stage;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		LoadCustomImage load = new LoadCustomImage();
		primaryStage.setTitle("WordGenereator");
		load.setImage(primaryStage, "1.jpg");

		primaryStage.show();
	}

}