package ticTacToe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.text.Font;

public class TicTacToeApplication extends Application {

    private boolean xTurn = true;

    @Override
    public void start(Stage stage) {
        // Create the main layout
        BorderPane layout = new BorderPane();

        // Create the label for showing the turn
        Label turnLabel = new Label("Turn: X");
        layout.setTop(turnLabel);
        BorderPane.setMargin(turnLabel, new Insets(10));

        // Create the GridPane for the buttons
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setHgap(10);
        grid.setVgap(10);

        // Create 9 buttons and add them to the GridPane
        Button[][] buttons = new Button[3][3];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                Button btn = new Button(" ");
                btn.setFont(Font.font("Monospaced", 40));
                btn.setMinSize(100, 100);
                final int r = row;
                final int c = col;
                btn.setOnAction(e -> handleMove(btn, r, c, turnLabel, buttons));
                buttons[row][col] = btn;
                grid.add(btn, col, row);
            }
        }

        // Set the GridPane in the center of the layout
        layout.setCenter(grid);

        // Create the scene and set the stage
        Scene scene = new Scene(layout, 400, 400);
        stage.setScene(scene);
        stage.setTitle("Tic Tac Toe");
        stage.show();
    }

    private void handleMove(Button btn, int row, int col, Label turnLabel, Button[][] buttons) {
        if (!btn.getText().equals(" ")) {
            return;
        }
        if (xTurn) {
            btn.setText("X");
            turnLabel.setText("Turn: O");
        } else {
            btn.setText("O");
            turnLabel.setText("Turn: X");
        }
        xTurn = !xTurn;

        if (checkWin(buttons)) {
            turnLabel.setText("The end!");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    buttons[i][j].setDisable(true);
                }
            }
        }
    }

    private boolean checkWin(Button[][] buttons) {
        for (int i = 0; i < 3; i++) {
            if (buttons[i][0].getText().equals(buttons[i][1].getText()) &&
                buttons[i][1].getText().equals(buttons[i][2].getText()) &&
                !buttons[i][0].getText().equals(" ")) {
                return true;
            }
            if (buttons[0][i].getText().equals(buttons[1][i].getText()) &&
                buttons[1][i].getText().equals(buttons[2][i].getText()) &&
                !buttons[0][i].getText().equals(" ")) {
                return true;
            }
        }
        if (buttons[0][0].getText().equals(buttons[1][1].getText()) &&
            buttons[1][1].getText().equals(buttons[2][2].getText()) &&
            !buttons[0][0].getText().equals(" ")) {
            return true;
        }
        if (buttons[0][2].getText().equals(buttons[1][1].getText()) &&
            buttons[1][1].getText().equals(buttons[2][0].getText()) &&
            !buttons[0][2].getText().equals(" ")) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
