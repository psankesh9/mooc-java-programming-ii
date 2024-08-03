package title;
;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.util.Scanner;

public class UserTitle extends Application {

    private static String userTitle;

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Welcome to the application!");

        Scene scene = new Scene(label, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle(userTitle);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a title for the application:");
        userTitle = scanner.nextLine();

        launch(args);
    }
}
