public class GasTank {
    private double capacity;

    GasTank(int capacity) {
        this.capacity = capacity;
        setCapacity(capacity);
    }

    public double getCapacity() {
        return capacity;
    }

    private void setCapacity(double capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
        } else {
            System.out.println("Incorrect capacity");
        }
    }
}
