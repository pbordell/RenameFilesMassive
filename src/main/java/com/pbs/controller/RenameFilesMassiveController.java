package com.pbs.controller;

import java.net.URL;
import java.nio.file.Path;
import java.util.ResourceBundle;

import com.pbs.util.PropertiesUtils;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.stage.FileChooser;

@SuppressWarnings({ "restriction" })
public class RenameFilesMassiveController implements Initializable {

	@FXML
	private Button change;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	@FXML
	void changeAction(ActionEvent event) {
		try {
			FileChooser chooser = new FileChooser();
			chooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Files", PropertiesUtils.readFormats()));

			Path newFile = chooser.showOpenDialog(((MenuItem) event.getSource()).getParentPopup().getScene().getWindow()).toPath();
			if (newFile != null) {
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
