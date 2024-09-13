public class Car {
    private String carName;
    private int milesDriven;
    private int gallonsUsed;

    public Car() {
        this.carName = "";
        this.milesDriven = 0;
        this.gallonsUsed = 0;
    }

    public Car(String name, int miles, int gallons) {
        this.carName = name;
        this.milesDriven = miles;
        this.gallonsUsed = gallons;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getMilesDriven() {
        return milesDriven;
    }

    public void setMilesDriven(int milesDriven) {
        this.milesDriven = milesDriven;
    }

    public int getGallonsUsed() {
        return gallonsUsed;
    }

    public void setGallonsUsed(int gallonsUsed) {
        this.gallonsUsed = gallonsUsed;
    }

    public double calculateAverage() {
        if (gallonsUsed == 0) {
            return 0.0;
        }
        return Math.round((double) milesDriven / gallonsUsed * 10.0) / 10.0;
    }

    public String toString() {
        return carName + " averaged " + calculateAverage() + " m/g";
    }
}
