package ro.ScoalaInformala;

public class Volkswagen extends Car {
    public Volkswagen(int tireSize, String chassisNumber) {
        super("Volkswagen", "Generic Model", 55.0, "Diesel", 4.5, tireSize, chassisNumber);
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