package ro.ScoalaInformala;

public class Dacia extends Car {
    public Dacia(int tireSize, String chassisNumber) {
        super("Dacia", "Logan", 50.0, "Petrol", 5.0, tireSize, chassisNumber);
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