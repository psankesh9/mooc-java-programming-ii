package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ButtonAndTextFieldApplication extends Application {

    @Override
    public void start(Stage stage) {
        // Create a TextField
        TextField textField = new TextField();

        // Create a Button
        Button button = new Button("Submit");

        // Create a layout and add the Button and TextField to it
        VBox layout = new VBox();
        layout.getChildren().addAll(button, textField);

        // Create a Scene and set it to the Stage
        Scene scene = new Scene(layout, 200, 100);
        stage.setScene(scene);

        // Set the title and show the Stage
        stage.setTitle("Button and TextField");
        stage.show();
    }

    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }
}
