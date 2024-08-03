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
    public void start(Stage primaryStage) {
        // Create UI components
        TextArea textArea = new TextArea();
        Label lettersLabel = new Label("Letters: 0");
        Label wordsLabel = new Label("Words: 0");
        Label longestWordLabel = new Label("The longest word is:");

        // Set up the layout using BorderPane
        BorderPane layout = new BorderPane();
        layout.setCenter(textArea);

        // Create a HBox for the text statistics
        HBox statsBox = new HBox();
        statsBox.setSpacing(10);  // Set spacing between components
        statsBox.getChildren().addAll(lettersLabel, wordsLabel, longestWordLabel);

        layout.setBottom(statsBox);

        // Set up the scene and stage
        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Text Statistics");
        primaryStage.show();

        // Add text area change listener
        textArea.textProperty().addListener((observable, oldValue, newValue) -> {
            int lettersCount = newValue.length();
            String[] words = newValue.split("\\s+");
            int wordsCount = (newValue.isEmpty()) ? 0 : words.length;
            String longestWord = (words.length == 0) ? "" : findLongestWord(words);

            lettersLabel.setText("Letters: " + lettersCount);
            wordsLabel.setText("Words: " + wordsCount);
            longestWordLabel.setText("The longest word is: " + longestWord);
        });
    }

    private String findLongestWord(String[] words) {
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
