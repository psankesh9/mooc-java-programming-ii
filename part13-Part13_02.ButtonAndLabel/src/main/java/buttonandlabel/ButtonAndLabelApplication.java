package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ButtonAndLabelApplication extends Application {

    @Override
    public void start(Stage stage) {
        // Create a Label
        Label label = new Label("This is a label");

        // Create a Button
        Button button = new Button("Click me");

        // Create a layout and add the Label and Button to it
        VBox layout = new VBox();
        layout.getChildren().addAll(label, button);

        // Create a Scene and set it to the Stage
        Scene scene = new Scene(layout, 200, 100);
        stage.setScene(scene);

        // Set the title and show the Stage
        stage.setTitle("Button and Label");
        stage.show();
    }

    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }
}
