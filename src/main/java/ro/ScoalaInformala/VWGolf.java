package ro.ScoalaInformala;

public class VWGolf extends Volkswagen{
    public VWGolf(int tireSize, String chassisNumber) {
        super("VWGolf", 50.0, "Petrol", 5.6, tireSize, chassisNumber);
    }

    @Override
    public void start() {
        System.out.println("Volkswagen Golf started...");
    }
    @Override
    public void stop() {
        System.out.println("Volkswagen Golf stopped...");
    }
}
