package ro.ScoalaInformala;

public abstract class Car extends Vehicle {
    private final double fuelTankSize;
    private final String fuelType;
    private final int gears;
    private final double consumptionPer100Km;
    private double availableFuel;
    private final int tireSize;
    private final String chassisNumber;
    private int currentGear;
    private double totalDistance;
    private double totalFuelConsumed;

    public Car(String brand, String model, double fuelTankSize, String fuelType,
               double consumptionPer100Km, int tireSize, String chassisNumber) {
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

    @Override
    public void start() {
        resetConsumptionStats();
        System.out.println("Car started...");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped...");
    }

    private void resetConsumptionStats() {
        totalDistance = 0.0;
        totalFuelConsumed = 0.0;
        availableFuel = fuelTankSize;
        currentGear = 1;
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
        double tireImpact = 1.0 + (tireSize - 15) * 0.05;
        double gearImpact = switch (currentGear) {
            case 1 -> 1.3;
            case 2 -> 1.15;
            case 3 -> 1.0;
            case 4 -> 0.97;
            case 5 -> 0.95;
            case 6 -> 0.93;
            default -> 1.0;
        };                   //Changed the way fuel is calculated so it has a more realistic impact
        return consumptionPer100Km * tireImpact * gearImpact;
    }

    @Override
    public void drive(double distance) {
        if (currentGear == 0) {
            System.out.println("Cannot drive: Car is in neutral.");
            return;
        }

        double fuelNeeded = (calculateFuelConsumption() / 100) * distance;
        if (fuelNeeded <= availableFuel) {
            availableFuel -= fuelNeeded;
            totalDistance += distance;
            totalFuelConsumed += fuelNeeded;
            System.out.printf("Driven %.2f km in gear %d. Fuel used: %.2f liters.%n",
                    distance, currentGear, fuelNeeded);
        } else {
            System.out.println("Not enough fuel to drive " + distance + " km.");
        }
    }

    public double getAvailableFuel() {
        return availableFuel;
    }

    public double getAverageFuelConsumption() {
        return totalDistance == 0 ? 0 : (totalFuelConsumed / totalDistance) * 100;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getChassisNumber() {
        return chassisNumber;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public double getTotalFuelConsumed() {
        return totalFuelConsumed;
    }
}