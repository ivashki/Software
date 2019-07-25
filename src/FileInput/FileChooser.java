package FileInput;

import javafx.stage.Stage;

public class FileChooser {
	public void chooseFileToInput(Stage type, String filename) {
		FileChooser fileChooser = new FileChooser();
		fileChooser.chooseFileToInput(filename);
		fileChooser.showOpenDialog(type);
	}
}
