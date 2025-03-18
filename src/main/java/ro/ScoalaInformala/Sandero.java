package ro.ScoalaInformala;

public class Sandero extends Dacia {
    public Sandero(int tireSize, String chassisNumber) {
        super("Sandero", 50.0, "Petrol", 4.4, tireSize, chassisNumber);
    }

    @Override
    public void start() {
        super.start();
        System.out.println("Dacia Sandero started!");
    }

    @Override
    public void stop() {
        System.out.println("Dacia Sandero stopped.");
    }
}

//