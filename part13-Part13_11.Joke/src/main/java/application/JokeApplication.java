package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JokeApplication extends Application {

    @Override
    public void start(Stage stage) {
        // Components
        Label displayLabel = new Label("What do you call a bear with no teeth?");
        Button jokeButton = new Button("Joke");
        Button answerButton = new Button("Answer");
        Button explanationButton = new Button("Explanation");

        // Layout
        VBox layout = new VBox();
        layout.setSpacing(10); // Add some spacing between the elements
        layout.getChildren().addAll(displayLabel, jokeButton, answerButton, explanationButton);

        // Button actions
        jokeButton.setOnAction(e -> displayLabel.setText("What do you call a bear with no teeth?"));
        answerButton.setOnAction(e -> displayLabel.setText("A gummy bear."));
        explanationButton.setOnAction(e -> displayLabel.setText("Because it has no teeth, it can only chew gummies."));

        // Scene
        Scene scene = new Scene(layout, 300, 200);

        // Setup stage
        stage.setScene(scene);
        stage.setTitle("Joke Application");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
