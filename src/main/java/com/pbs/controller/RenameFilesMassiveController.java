package com.pbs.controller;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;

public class RenameFilesMassiveController implements Initializable {

	@FXML
	private TextField directoryTextField;

	@FXML
	private TextField inputTextToChange;

	@FXML
	private TextField inputTextChanged;

	@FXML
	private TextArea outputText;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	@FXML
	public void handleChangeDirectoryBtnClick() {
		DirectoryChooser directoryChooser = new DirectoryChooser();
		File selectedDirectory = directoryChooser.showDialog(null);

		if (selectedDirectory == null) {
			directoryTextField.setText("No ha seleccionado ningún directorio!");
		} else if (selectedDirectory.isDirectory() && selectedDirectory.list().length == 0) {
			directoryTextField.setText("El directorio seleccionado está vacio!");
		} else {
			directoryTextField.setText(selectedDirectory.getAbsolutePath());
		}
	}

	@FXML
	void changeAction(ActionEvent event) {
		if (validatefields()) {
			try {
				final String path = directoryTextField.getText();
				final String oldName = inputTextToChange.getText();
				final String newName = inputTextChanged.getText();

				final StringBuilder result = new StringBuilder();
				AtomicInteger runCount = new AtomicInteger(0);
				Stream.of(new File(path).listFiles())
						.filter(file -> !file.isDirectory())
						.filter(file -> file.getName().contains(oldName))
						.forEach(f -> {
					String finalName = f.getName().replaceAll(oldName, newName);
					String pathResultFile = f.getParent() + File.separator + finalName;
					result.append("Cambio nombre del fichero " + f.getName() + " a " + finalName);
					if(f.renameTo(new File(pathResultFile))) {
						result.append(" OK \n");
						runCount.getAndIncrement();
					} else {
						result.append(" KO \n");
					}
				});
				
				result.append("\nSe han modificado " + runCount.get() + " nombres de ficheros");
				outputText.setText(result.toString());

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private boolean validatefields() {
		StringBuilder sb = new StringBuilder();
		if (directoryTextField.getText().equals("")) {
			sb.append(" directoryTextField ");
		}

		if (inputTextToChange.getText().equals("")) {
			sb.append(" inputTextToChange ");
		}

		String message = sb.toString();
		if (message.length() > 0) {
			JOptionPane.showMessageDialog(null, "Rellene los campos: " + message);
			return false;
		}

		return true;
	}

}
