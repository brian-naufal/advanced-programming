package Vehicle;

public class Vehicle1 {
    private double load;
    private final double maxLoad = 10000;

    public double getLoad() {
        return load;
    }

    public double getMaxLoad() {
        return maxLoad;
    }

    public boolean addBox(double weight) {
        if (load + weight <= maxLoad) {
            load += weight;
            return true;
        }
        return false;
    }
}