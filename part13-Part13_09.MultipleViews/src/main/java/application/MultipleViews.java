package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    @Override
    public void start(Stage stage) {
        // First view
        BorderPane firstView = new BorderPane();
        Label firstLabel = new Label("First view!");
        Button toSecondViewButton = new Button("To the second view!");
        firstView.setTop(firstLabel);
        firstView.setCenter(toSecondViewButton);

        // Second view
        VBox secondView = new VBox();
        Button toThirdViewButton = new Button("To the third view!");
        Label secondLabel = new Label("Second view!");
        secondView.getChildren().addAll(toThirdViewButton, secondLabel);

        // Third view
        GridPane thirdView = new GridPane();
        Label thirdLabel = new Label("Third view!");
        Button toFirstViewButton = new Button("To the first view!");
        thirdView.add(thirdLabel, 0, 0);
        thirdView.add(toFirstViewButton, 1, 1);

        // Scenes
        Scene firstScene = new Scene(firstView, 300, 200);
        Scene secondScene = new Scene(secondView, 300, 200);
        Scene thirdScene = new Scene(thirdView, 300, 200);

        // Button actions
        toSecondViewButton.setOnAction(e -> stage.setScene(secondScene));
        toThirdViewButton.setOnAction(e -> stage.setScene(thirdScene));
        toFirstViewButton.setOnAction(e -> stage.setScene(firstScene));

        // Initial scene
        stage.setScene(firstScene);
        stage.setTitle("Multiple Views");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
