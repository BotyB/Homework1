package ro.ScoalaInformala;

public class VWPassat extends Volkswagen {
    public VWPassat(int tireSize, String chassisNumber) {
        super("VWPassat", 50.0, "Petrol", 7.5, tireSize, chassisNumber);
    }

    @Override
    public void start() {
        super.start();
        System.out.println("Volkswagen Passat started!");
    }

    @Override
    public void stop() {
        System.out.println("Volkswagen Passat stopped.");
    }
}