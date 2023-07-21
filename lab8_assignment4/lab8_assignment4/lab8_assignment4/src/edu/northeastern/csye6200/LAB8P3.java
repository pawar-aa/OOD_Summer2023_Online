// Author: Aashay Pawar
// NUID: 002134382
// Date: 2023-07-21
// Description: Problem 3

package edu.northeastern.csye6200;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import java.io.IOException;
import java.util.Random;

public class LAB8P3 extends Application {
	private static final int MAX_SIZE = 10;

	@Override
	public void start(Stage primaryStage) throws IOException {
		// Create a new GridPane to organize the TextFields in a grid layout
		GridPane gridPane = new GridPane();

		// Create a new Random object to generate random 0s and 1s for the matrix
		Random random = new Random();

		// Loop through each row and column to create and fill the TextFields with random 0s and 1s
		for (int row = 0; row < MAX_SIZE; row++) {
			for (int col = 0; col < MAX_SIZE; col++) {
				// Create a new TextField to represent a cell in the matrix
				TextField textField = new TextField();

				// Generate a random 0 or 1 and set it as the text in the TextField
				int val = random.nextInt(2);
				textField.setText(Integer.toString(val));

				// Center-align the text in the TextField
				textField.setAlignment(javafx.geometry.Pos.CENTER);

				// Add the TextField to the GridPane at the specified row and column
				gridPane.add(textField, col, row);
			}
		}

		// Create a new Scene with the GridPane and set its dimensions
		Scene scene = new Scene(gridPane, 300, 300);

		// Set the title of the stage (window)
		primaryStage.setTitle("Matrix Display");

		// Set the Scene for the stage and display it
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		// Launch the JavaFX application
		launch(args);
	}
}
