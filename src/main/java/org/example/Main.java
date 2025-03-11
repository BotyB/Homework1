package org.example;

public class Main {
    public static void main(String[] args) {
        //Phone phone = new IPhone12("009954586", "Onyx Grey", "Titan");
        Phone phone = new SamsungGalaxyS6("000342634", "Black", "Metal");
        //IPhone starts with 20 BatteryLife while Samsung has 24

        phone.addContact("1", "0765497703", "Mihai", "Iepure");
        phone.addContact("2", "0755399210", "Andrei", "Pop");

        phone.sendMessage("0765497703", "Hello Mihai, this is an automated message.");

        phone.call("0755399210");

        phone.viewHistory();

        System.out.println("First message: " + phone.getFirstMessage("0765497703"));
        System.out.println("Second message: " + phone.getSecondMessage("0755399210"));
        phone.printRemainingBatteryLife();
    }


}