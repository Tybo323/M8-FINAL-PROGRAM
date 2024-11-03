package finalcsc372;

/**
 * Represents vehicle with make, model, and mpg (miles per gallon).
 */
class Vehicle {
    private String make;
    private String model;
    private double mpg;

    public Vehicle(String make, String model, double mpg) {
        this.make = make;
        this.model = model;
        this.mpg = mpg;
    }

    public double getmpg() {
        return mpg;
    }

    @Override
    public String toString() {
        return "MAKE: " + make + ", MODEL: " + model + ", MPG: " + mpg;
    }
}

