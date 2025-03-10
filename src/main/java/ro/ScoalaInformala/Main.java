package ro.ScoalaInformala;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarCatalog catalog = new CarCatalog();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Car Catalog!");
        System.out.println("Enter Car Brand (Dacia/Volkswagen): ");
        String brand = scanner.nextLine();
        System.out.println("Enter Car Model (Logan/VWGolf): ");
        String model = scanner.nextLine();
        System.out.println("Enter tire size (15, 16, 17): ");
        int tireSize = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter a chassis number: ");
        String chassisNumber = scanner.nextLine();

        Car car;
        if (brand.equalsIgnoreCase("Dacia") && model.equalsIgnoreCase("Logan")) {
            car = new Logan(tireSize, chassisNumber);
        } else if (brand.equalsIgnoreCase("Volkswagen") && model.equalsIgnoreCase("VWGolf")) {
            car = new VWGolf(tireSize, chassisNumber);
        } else {
            System.out.println("Invalid brand or model.");
            return;
        }

        Car logan = new Logan(15, "123456789");
        logan.start();
        logan.shiftGear(1);
        logan.drive(10.0);
        logan.stop();
        System.out.println("Available fuel: " + logan.getAvailableFuel() + " liters");
        System.out.println("Average fuel consumption: " + logan.getAverageFuelConsumption() + " liters/100 km");

        Car vwGolf = new VWGolf(16, "987654321");
        vwGolf.start();
        vwGolf.shiftGear(1);
        vwGolf.drive(10.0);
        vwGolf.stop();
        System.out.println("Available fuel: " + vwGolf.getAvailableFuel() + " liters");
        System.out.println("Average fuel consumption: " + vwGolf.getAverageFuelConsumption() + " liters/100 km");

        catalog.addCar(car);

        System.out.println("\nCar created successfully!");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Tire size: " + tireSize);
        System.out.println("Chassis number: " + chassisNumber);

        car.start();
        car.shiftGear(1);
        car.drive(10.0);
        car.shiftGear(2);
        car.drive(20.0);
        car.shiftGear(3);
        car.drive(30.0);
        car.shiftGear(4);
        car.drive(40.0);
        car.shiftGear(5);
        car.drive(50.0);
        car.shiftGear(6);
        car.drive(60.0);
        car.shiftGear(5);
        car.drive(0.5);
        car.shiftGear(4);
        car.drive(0.4);
        car.shiftGear(3);
        car.drive(0.3);
        car.shiftGear(2);
        car.drive(0.2);
        car.shiftGear(1);
        car.drive(0.1);
        car.stop();
        System.out.println("\nCar Status: ");
        System.out.println("Available fuel: " + car.getAvailableFuel() + " liters");
        System.out.println("Average fuel consumption: " + car.getAverageFuelConsumption() + " liters/100 km");
    }
}

// CarInterface removed and used Main instead
// Remade the whole project to use the CarCatalog class
// removed interface and vehicle management system
//removed GearBox class and removed acceleration and deceleration methods