package collage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CollageApplication extends Application {

    @Override
    public void start(Stage stage) {
        // Load the Mona Lisa image
        Image monaLisa = new Image("file:monalisa.png");

        // Create a Pane
        Pane pane = new Pane();
        pane.setPrefSize(monaLisa.getWidth(), monaLisa.getHeight());

        // Add the scaled images to the Pane
        double scale = 0.5;
        ImageView imageView1 = createImageView(monaLisa, 0, 0, scale);
        ImageView imageView2 = createImageView(monaLisa, monaLisa.getWidth() / 2, 0, scale);
        ImageView imageView3 = createImageView(monaLisa, 0, monaLisa.getHeight() / 2, scale);
        ImageView imageView4 = createNegativeImageView(monaLisa, monaLisa.getWidth() / 2, monaLisa.getHeight() / 2, scale);

        pane.getChildren().addAll(imageView1, imageView2, imageView3, imageView4);

        // Create a BorderPane and set the Pane in the center
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);

        Scene scene = new Scene(borderPane);
        stage.setScene(scene);
        stage.setTitle("Collage Application");
        stage.show();
    }

    private ImageView createImageView(Image image, double x, double y, double scale) {
        double width = image.getWidth() * scale;
        double height = image.getHeight() * scale;
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(width);
        imageView.setFitHeight(height);
        imageView.setX(x);
        imageView.setY(y);
        return imageView;
    }

    private ImageView createNegativeImageView(Image image, double x, double y, double scale) {
        double width = image.getWidth() * scale;
        double height = image.getHeight() * scale;
        WritableImage negativeImage = new WritableImage((int) width, (int) height);
        PixelReader pixelReader = image.getPixelReader();

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Color color = pixelReader.getColor((int) (i / scale), (int) (j / scale));
                Color negativeColor = new Color(1.0 - color.getRed(), 1.0 - color.getGreen(), 1.0 - color.getBlue(), color.getOpacity());
                negativeImage.getPixelWriter().setColor(i, j, negativeColor);
            }
        }

        ImageView imageView = new ImageView(negativeImage);
        imageView.setFitWidth(width);
        imageView.setFitHeight(height);
        imageView.setX(x);
        imageView.setY(y);
        return imageView;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
