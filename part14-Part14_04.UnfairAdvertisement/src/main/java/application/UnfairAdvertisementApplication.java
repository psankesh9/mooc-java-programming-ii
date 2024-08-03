package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class UnfairAdvertisementApplication extends Application {

    @Override
    public void start(Stage stage) {
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();
        
        xAxis.setLabel("Company");
        yAxis.setLabel("Speed (Mbps)");

        BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);
        barChart.setTitle("Internet Speed Comparison");

        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("Internet Speed");

        series.getData().add(new XYChart.Data<>("Our Company", 100));
        series.getData().add(new XYChart.Data<>("Competitor", 50));

        barChart.getData().add(series);

        Scene scene = new Scene(barChart, 800, 600);
        stage.setScene(scene);
        stage.setTitle("Unfair Advertisement");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
