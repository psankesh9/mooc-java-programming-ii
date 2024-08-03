package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create UI components
        TextField textField = new TextField();
        Button button = new Button("Copy Text");
        Label label = new Label();

        // Set up button action
        button.setOnAction(event -> {
            String text = textField.getText();
            label.setText(text);
        });

        // Set up the layout
        VBox layout = new VBox();
        layout.setSpacing(10);  // Set spacing between components
        layout.getChildren().addAll(textField, button, label);

        // Set up the scene and stage
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Notifier");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
