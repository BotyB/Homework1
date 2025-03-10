package ro.ScoalaInformala;

public class Logan extends Dacia {
    public Logan(int tireSize, String chassisNumber) {
        super(tireSize, chassisNumber);
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