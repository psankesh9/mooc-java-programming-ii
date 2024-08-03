package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application {

    @Override
    public void start(Stage stage) {
        // Create the axes
        NumberAxis xAxis = new NumberAxis(2007, 2017, 1);
        NumberAxis yAxis = new NumberAxis();

        // Label the axes
        xAxis.setLabel("Year");
        yAxis.setLabel("Rank");

        // Create the line chart
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki Ranking (2007-2017)");

        // Create the data series
        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.setName("University of Helsinki");

        // Add data points
        series.getData().add(new XYChart.Data<>(2007, 73));
        series.getData().add(new XYChart.Data<>(2008, 68));
        series.getData().add(new XYChart.Data<>(2009, 72));
        series.getData().add(new XYChart.Data<>(2010, 72));
        series.getData().add(new XYChart.Data<>(2011, 74));
        series.getData().add(new XYChart.Data<>(2012, 73));
        series.getData().add(new XYChart.Data<>(2013, 76));
        series.getData().add(new XYChart.Data<>(2014, 73));
        series.getData().add(new XYChart.Data<>(2015, 67));
        series.getData().add(new XYChart.Data<>(2016, 56));
        series.getData().add(new XYChart.Data<>(2017, 56));

        // Add series to chart
        lineChart.getData().add(series);

        // Create the scene and set the stage
        Scene scene = new Scene(lineChart, 800, 600);
        stage.setScene(scene);
        stage.setTitle("Shanghai Ranking");
        stage.show();
    }

    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
    }
}
