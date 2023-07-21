// Author: Aashay Pawar
// NUID: 002134382
// Date: 2023-07-21
// Description: Problem 2

package edu.northeastern.csye6200;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LAB8P2 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Create a new Pane to hold the visual elements
		Pane p = new Pane();
		
		// Define the overall height of the bar chart and the height of the pane
		double height = 600;
		double pHeight = 300;
		
		// Create a rectangle representing the project component of the bar chart
		Rectangle bar = new Rectangle(10, pHeight - height * 0.35, 100, height * 0.35);
		bar.setFill(Color.BLUE); // Set the color of the project component
		Text text = new Text(10, pHeight - height * 0.35 - 10, "Project -- 35%"); // Add a label for the project component
		p.getChildren().addAll(bar, text); // Add the rectangle and text to the pane
		
		// Create a rectangle representing the exams component of the bar chart
		bar = new Rectangle(10 + 110, pHeight - height * 0.3, 100, height * 0.3);
		bar.setFill(Color.GREEN); // Set the color of the exams component
		text = new Text(10 + 110, pHeight - height * 0.3 - 10, "Exams -- 30%"); // Add a label for the exams component
		p.getChildren().addAll(bar, text); // Add the rectangle and text to the pane
		
		// Create a rectangle representing the assignments component of the bar chart
		bar = new Rectangle(10 + 220, pHeight - height * 0.3, 100, height * 0.3);
		bar.setFill(Color.RED); // Set the color of the assignments component
		text = new Text(10 + 220, pHeight - height * 0.3 - 10, "Assignments -- 30%"); // Add a label for the assignments component
		p.getChildren().addAll(bar, text); // Add the rectangle and text to the pane
		
		// Create a rectangle representing the attendance component of the bar chart
		bar = new Rectangle(10 + 330, pHeight - height * 0.05, 100, height * 0.05);
		bar.setFill(Color.ORANGE); // Set the color of the attendance component
		text = new Text(10 + 330, pHeight - height * 0.05 - 10, "Attendance -- 5%"); // Add a label for the attendance component
		p.getChildren().addAll(bar, text); // Add the rectangle and text to the pane

		// Create a scene with the pane and set its dimensions
		Scene scene = new Scene(p, 450, pHeight);
		
		// Set the title of the stage (window)
		primaryStage.setTitle("Lab8_Problem2");
		
		// Set the scene for the stage and display it
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		// Launch the JavaFX application
		launch(args);
	}
}
