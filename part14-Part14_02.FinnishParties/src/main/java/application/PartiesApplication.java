package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    @Override
    public void start(Stage stage) {
        // Create the axes
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Year");
        yAxis.setLabel("Support (%)");

        // Create the line chart
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of Finnish parties (1968-2008)");

        // Load the data
        Map<String, XYChart.Series<Number, Number>> partyData = loadData();

        // Add the data to the chart
        for (XYChart.Series<Number, Number> series : partyData.values()) {
            lineChart.getData().add(series);
        }

        // Create the scene and set the stage
        Scene scene = new Scene(lineChart, 800, 600);
        stage.setScene(scene);
        stage.setTitle("Finnish Parties Support");
        stage.show();
    }

    private Map<String, XYChart.Series<Number, Number>> loadData() {
        Map<String, XYChart.Series<Number, Number>> partyData = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("partiesdata.tsv"))) {
            String line = reader.readLine(); // Read the header line

            if (line != null) {
                String[] years = line.split("\t");

                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split("\t");
                    String party = parts[0];

                    XYChart.Series<Number, Number> series = new XYChart.Series<>();
                    series.setName(party);

                    for (int i = 1; i < parts.length; i++) {
                        String value = parts[i];

                        try {
                            double support = Double.parseDouble(value);
                            int year = Integer.parseInt(years[i]);
                            series.getData().add(new XYChart.Data<>(year, support));
                        } catch (NumberFormatException e) {
                            // Skip this value if it is not a valid number
                            System.out.println("Invalid value: " + value + " for party: " + party + " in year: " + years[i]);
                        }
                    }

                    partyData.put(party, series);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return partyData;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
