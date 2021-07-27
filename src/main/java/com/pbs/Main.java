package com.pbs;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage stage) throws Exception {

		// Create the FXMLLoader
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/pbs/fxml/renamefilesmassive.fxml"));

		// Create the Pane and all Details
		VBox vBox = loader.load();

		// Create the Scene
		Scene scene = new Scene(vBox);

		// Set the Scene to the Stage
		stage.setScene(scene);
		stage.setTitle("RenameFilesMassive");
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
