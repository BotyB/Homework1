package ro.ScoalaInformala;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarCatalog catalog = new CarCatalog();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Car Simulator!");
        System.out.println("Available brands: Dacia, Volkswagen");
        System.out.print("Enter car brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter car model (Logan/Sandero for Dacia; VWGolf/VWPassat for Volkswagen): ");
        String model = scanner.nextLine();

        System.out.print("Enter tire size (15, 16, 17): ");
        int tireSize = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter chassis number: ");
        String chassisNumber = scanner.nextLine();

        Car car = createCar(brand, model, tireSize, chassisNumber);
        if (car == null) {
            System.out.println("Invalid brand/model combination. Exiting.");
            return;
        }

        catalog.addCar(car);

        System.out.printf("\nStarting fuel level: %.2f liters%n", car.getAvailableFuel());

        simulateDriving(car);

        System.out.println("\nFinal Stats:");
        System.out.printf("Total distance: %.2f km%n", car.getTotalDistance());
        System.out.printf("Total fuel used: %.2f liters%n", car.getTotalFuelConsumed());
        System.out.printf("Available fuel: %.2f liters%n", car.getAvailableFuel());
        System.out.printf("Average consumption: %.2f liters/100 km%n",
                car.getAverageFuelConsumption());
    }

    private static Car createCar(String brand, String model, int tireSize, String chassisNumber) {
        switch (brand.toLowerCase()) {
            case "dacia":
                switch (model.toLowerCase()) {
                    case "logan":
                        return new Logan(tireSize, chassisNumber);
                    case "sandero":
                        return new Sandero(tireSize, chassisNumber);
                    default:
                        return null;
                }
            case "volkswagen":
                switch (model.toLowerCase()) {
                    case "vwgolf":
                        return new VWGolf(tireSize, chassisNumber);
                    case "vwpassat":
                        return new VWPassat(tireSize, chassisNumber);
                    default:
                        return null;
                }
            default:
                return null;
        }
    }

    private static void simulateDriving(Car car) {
        car.start();
        car.shiftGear(1);
        car.drive(2.0);
        car.shiftGear(2);
        car.drive(6.0);
        car.shiftGear(3);
        car.drive(14.0);
        car.shiftGear(4);
        car.drive(30.0);
        car.shiftGear(5);
        car.drive(50.0);
        car.shiftGear(6);
        car.drive(100.0);
        car.shiftGear(5);
        car.drive(20.0);
        car.shiftGear(4);
        car.drive(14.0);
        car.shiftGear(3);
        car.drive(10.0);
        car.shiftGear(2);
        car.drive(8.0);
        car.shiftGear(1);
        car.drive(4.0);
        car.stop();
    }
}