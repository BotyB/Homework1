package ro.ScoalaInformala;

public abstract class Vehicle {
    public abstract void start();
    public abstract void drive(double distance);
    public abstract void stop();

    private String brand;
    private String model;

    public Vehicle(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

//