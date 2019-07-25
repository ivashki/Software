package Àppearance;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class LoadCustomImage {
	public void setImage(Stage type, String filename) {
		StackPane sp = new StackPane();
		Image img = new Image(filename);
		ImageView imgView = new ImageView(img);
		imgView.setFitWidth(Screen.getPrimary().getVisualBounds().getWidth());
		imgView.setFitHeight(Screen.getPrimary().getVisualBounds().getHeight());
		sp.getChildren().add(imgView);
		Scene scene = new Scene(sp);
		type.setScene(scene);
		type.setMaximized(true);
	}
}
