package ro.ScoalaInformala;

public abstract class Volkswagen extends Car {
    public Volkswagen(String model, double fuelTankSize, String fuelType,
                      double consumptionPer100Km, int tireSize, String chassisNumber) {
        super("Volkswagen", model, fuelTankSize, fuelType, consumptionPer100Km,
                tireSize, chassisNumber);
    }

    @Override
    public void start() {
        System.out.println("Volkswagen started...");
    }

    @Override
    public void stop() {
        System.out.println("Volkswagen stopped...");
    }
}