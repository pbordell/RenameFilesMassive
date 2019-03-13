package com.pbs;

import java.io.File;
import java.util.Arrays;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

@SuppressWarnings({ "restriction" })
public class Main extends Application {

	@Override
	public void start(Stage stage) throws Exception {

		final Label labelSelectedDirectory = new Label();

		Button btnOpenDirectoryChooser = new Button();
		btnOpenDirectoryChooser.setText("Carregui un directori amb arxius");
		btnOpenDirectoryChooser.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				DirectoryChooser directoryChooser = new DirectoryChooser();
				File selectedDirectory = directoryChooser.showDialog(stage);

				if (selectedDirectory == null) {
					labelSelectedDirectory.setText("No has seleccionat un directori!");
				} else {
					labelSelectedDirectory.setText(selectedDirectory.getAbsolutePath());
				}
			}
		});

		// Create the FXMLLoader
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/pbs/fxml/hola.fxml"));

		// Create the Pane and all Details
		VBox vBox = loader.load();
		vBox.getChildren().addAll(0, Arrays.asList(labelSelectedDirectory, btnOpenDirectoryChooser));

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
