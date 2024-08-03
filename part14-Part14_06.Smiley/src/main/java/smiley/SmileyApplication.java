package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SmileyApplication extends Application {

    @Override
    public void start(Stage stage) {
        // Create the main layout
        BorderPane layout = new BorderPane();
        
        // Create the canvas
        Canvas canvas = new Canvas(400, 400);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Draw the smiley face
        drawSmiley(gc);

        // Set the canvas in the center of the layout
        layout.setCenter(canvas);

        // Create the scene and set the stage
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.setTitle("Smiley Face");
        stage.show();
    }

    private void drawSmiley(GraphicsContext gc) {
        // Set background color
        gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, 400, 400);

        // Set smiley color
        gc.setFill(Color.BLACK);

        // Draw face
        gc.fillOval(100, 100, 200, 200);

        // Draw eyes
        gc.setFill(Color.WHITE);
        gc.fillOval(150, 150, 30, 30);
        gc.fillOval(220, 150, 30, 30);
        
        // Draw mouth
        gc.setFill(Color.BLACK);
        gc.fillArc(150, 220, 100, 50, 0, -180, javafx.scene.shape.ArcType.OPEN);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
