package ro.ScoalaInformala;

public abstract class Dacia extends Car {
    public Dacia(String model, double fuelTankSize, String fuelType,
                 double consumptionPer100Km, int tireSize, String chassisNumber) {
        super("Dacia", model, fuelTankSize, fuelType, consumptionPer100Km,
                tireSize, chassisNumber);
    }

    @Override
    public void start() {
        System.out.println("Dacia started...");
    }

    @Override
    public void stop() {
        System.out.println("Dacia stopped...");
    }
}
//