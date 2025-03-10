package ro.ScoalaInformala;

public class VWGolf extends Volkswagen{
    public VWGolf(int tireSize, String chassisNumber) {
        super(tireSize, chassisNumber);
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
