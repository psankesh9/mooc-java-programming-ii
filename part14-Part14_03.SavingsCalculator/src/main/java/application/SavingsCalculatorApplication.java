package application;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {

    @Override
    public void start(Stage stage) {
        // Create the main layout
        BorderPane layout = new BorderPane();

        // Create the sliders
        Slider savingsSlider = createSlider(25, 250, 25);
        Slider interestSlider = createSlider(0, 10, 0);

        // Create the labels
        Label savingsLabel = new Label("Monthly savings: " + (int) savingsSlider.getValue());
        Label interestLabel = new Label("Yearly interest rate: " + (int) interestSlider.getValue() + "%");

        // Create the chart
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Savings Calculator");

        // Create the initial series
        XYChart.Series<Number, Number> savingsSeries = new XYChart.Series<>();
        savingsSeries.setName("Savings");
        lineChart.getData().add(savingsSeries);

        XYChart.Series<Number, Number> interestSeries = new XYChart.Series<>();
        interestSeries.setName("Savings with Interest");
        lineChart.getData().add(interestSeries);

        // Update the chart when the sliders are moved
        ChangeListener<Number> updateChart = (obs, oldVal, newVal) -> {
            updateSeries(savingsSeries, interestSeries, savingsSlider.getValue(), interestSlider.getValue());
            savingsLabel.setText("Monthly savings: " + (int) savingsSlider.getValue());
            interestLabel.setText("Yearly interest rate: " + (int) interestSlider.getValue() + "%");
        };

        savingsSlider.valueProperty().addListener(updateChart);
        interestSlider.valueProperty().addListener(updateChart);

        // Set the initial data
        updateSeries(savingsSeries, interestSeries, savingsSlider.getValue(), interestSlider.getValue());

        // Create the top VBox
        VBox topVBox = new VBox();
        topVBox.getChildren().addAll(createLabeledPane("Monthly savings", savingsSlider, savingsLabel),
                createLabeledPane("Yearly interest rate", interestSlider, interestLabel));

        layout.setTop(topVBox);
        layout.setCenter(lineChart);

        Scene scene = new Scene(layout, 800, 600);
        stage.setScene(scene);
        stage.setTitle("Savings Calculator");
        stage.show();
    }

    private Slider createSlider(double min, double max, double value) {
        Slider slider = new Slider(min, max, value);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit((max - min) / 5);
        slider.setMinorTickCount(5);
        slider.setBlockIncrement(5);
        return slider;
    }

    private BorderPane createLabeledPane(String labelText, Slider slider, Label valueLabel) {
        BorderPane pane = new BorderPane();
        pane.setLeft(new Label(labelText));
        pane.setCenter(slider);
        pane.setRight(valueLabel);
        return pane;
    }

    private void updateSeries(XYChart.Series<Number, Number> savingsSeries,
                              XYChart.Series<Number, Number> interestSeries,
                              double monthlySavings, double yearlyInterestRate) {
        savingsSeries.getData().clear();
        interestSeries.getData().clear();

        double savings = 0;
        double savingsWithInterest = 0;
        double monthlyInterestRate = yearlyInterestRate / 100 / 12;

        for (int year = 0; year <= 30; year++) {
            savingsSeries.getData().add(new XYChart.Data<>(year, savings));
            interestSeries.getData().add(new XYChart.Data<>(year, savingsWithInterest));

            savings += monthlySavings * 12;
            savingsWithInterest = (savingsWithInterest + monthlySavings * 12) * (1 + monthlyInterestRate * 12);
        }
    }

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }
}
