package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    @Override
    public void start(Stage stage) {
        // First view
        VBox firstView = new VBox();
        TextField nameField = new TextField("Enter your name");
        Button greetButton = new Button("Start");
        firstView.getChildren().addAll(nameField, greetButton);

        // Clear the placeholder text when the user starts typing
        nameField.setOnMouseClicked(event -> {
            if (nameField.getText().equals("Enter your name")) {
                nameField.clear();
            }
        });

        // Second view
        BorderPane secondView = new BorderPane();
        Label greetingLabel = new Label();
        secondView.setCenter(greetingLabel);

        // Scenes
        Scene firstScene = new Scene(firstView, 300, 200);
        Scene secondScene = new Scene(secondView, 300, 200);

        // Button action
        greetButton.setOnAction(e -> {
            String name = nameField.getText();
            greetingLabel.setText("Welcome " + name + "!");
            stage.setScene(secondScene);
        });

        // Initial scene
        stage.setScene(firstScene);
        stage.setTitle("Greeter");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
