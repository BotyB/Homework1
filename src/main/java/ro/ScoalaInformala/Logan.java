package ro.ScoalaInformala;

public class Logan extends Dacia {
    public Logan(int tireSize, String chassisNumber) {
        super("Logan", 50.0, "Petrol", 5.5, tireSize, chassisNumber);
    }
    @Override
    public void start() {
        System.out.println("Dacia Logan started...");
    }

    @Override
    public void stop() {
        System.out.println("Dacia Logan stopped...");
    }
}

//