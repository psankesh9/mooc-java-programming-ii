package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    @Override
    public void start(Stage stage) {
        // Create a TextArea for the center
        TextArea textArea = new TextArea();

        // Create text components for the bottom edge
        Label letters = new Label("Letters: 0");
        Label words = new Label("Words: 0");
        Label longestWord = new Label("The longest word is:");

        // Create an HBox to hold the text components
        HBox bottomBox = new HBox(10); // 10 pixels spacing between elements
        bottomBox.getChildren().addAll(letters, words, longestWord);

        // Create a BorderPane layout
        BorderPane borderPane = new BorderPane();

        // Add components to the BorderPane
        borderPane.setCenter(textArea);
        borderPane.setBottom(bottomBox);

        // Create a Scene and set it to the Stage
        Scene scene = new Scene(borderPane, 400, 300);
        stage.setScene(scene);

        // Set the title and show the Stage
        stage.setTitle("Text Statistics");
        stage.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }
}

