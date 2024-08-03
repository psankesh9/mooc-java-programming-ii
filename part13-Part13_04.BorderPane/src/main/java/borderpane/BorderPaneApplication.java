package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneApplication extends Application {

    @Override
    public void start(Stage stage) {
        // Create text components
        Label north = new Label("NORTH");
        Label east = new Label("EAST");
        Label south = new Label("SOUTH");

        // Create a BorderPane layout
        BorderPane borderPane = new BorderPane();

        // Add text components to the BorderPane
        borderPane.setTop(north);
        borderPane.setRight(east);
        borderPane.setBottom(south);

        // Create a Scene and set it to the Stage
        Scene scene = new Scene(borderPane, 300, 200);
        stage.setScene(scene);

        // Set the title and show the Stage
        stage.setTitle("BorderPane Layout");
        stage.show();
    }

    public static void main(String[] args) {
        launch(BorderPaneApplication.class);
    }
}
