package ro.ScoalaInformala;

public abstract class Car extends Vehicle {
    private final double fuelTankSize;
    private final String fuelType;
    private final int gears;
    private final double consumptionPer100Km;
    private double availableFuel;
    private int tireSize;
    private final String chassisNumber;
    private int currentGear;
    private double totalDistance;
    private double totalFuelConsumed;

    public Car(String brand, String model, double fuelTankSize, String fuelType, double consumptionPer100Km, int tireSize, String chassisNumber) {
        super(model, brand);
        this.fuelTankSize = fuelTankSize;
        this.fuelType = fuelType;
        this.gears = 6;
        this.consumptionPer100Km = consumptionPer100Km;
        this.tireSize = tireSize;
        this.chassisNumber = chassisNumber;
        this.currentGear = 1;
        this.availableFuel = fuelTankSize;
        this.totalDistance = 0.0;
        this.totalFuelConsumed = 0.0;
    }

    public double getAvailableFuel() {
        return availableFuel;
    }

    public int getTireSize() {
        return tireSize;
    }

    public void setTireSize(int tireSize) {
        this.tireSize = tireSize;
    }

    public String getChassisNumber() {
        return chassisNumber;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public double getTotalFuelConsumed() {
        return totalFuelConsumed;
    }

    public final void shiftGear(int gear) {
        if (gear >= 1 && gear <= gears) {
            if (gear < currentGear) {
                System.out.println("Shift down to gear " + gear);
            } else if (gear > currentGear) {
                System.out.println("Shift up to gear " + gear);
            }
            currentGear = gear;
        } else {
            System.out.println("Invalid gear. Gear must be between 1 and " + gears + ".");
        }
    }

    protected final double calculateFuelConsumption() {
        double tireImpact = 1.0 + (tireSize - 15) * 0.02;
        double gearImpact = 1.0 - (currentGear - 1) * 0.03;
        return consumptionPer100Km * tireImpact * gearImpact;
    }

    @Override
    public void drive(double distance) {
        double fuelConsumed = (calculateFuelConsumption() / 100) * distance;
        if (fuelConsumed <= availableFuel) {
            availableFuel -= fuelConsumed;
            totalDistance += distance;
            totalFuelConsumed += fuelConsumed;
            System.out.printf("Driving %.2f km in gear %d. Fuel consumed: %.2f liters.%n", distance, currentGear, fuelConsumed);
        } else {
            System.out.println("Not enough fuel to drive " + distance + " km.");
        }
    }

    public double getAverageFuelConsumption() {
        if (totalDistance == 0) {
            return 0.0;
        }
        return (totalFuelConsumed / totalDistance) * 100;
    }
}