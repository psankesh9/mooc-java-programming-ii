import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double max = Double.MIN_VALUE;
        for (double value : this.history) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public double minValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double min = Double.MAX_VALUE;
        for (double value : this.history) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public double average() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (double value : this.history) {
            sum += value;
        }
        return sum / this.history.size();
    }

    @Override
    public String toString() {
        return this.history.toString();
    }
}
