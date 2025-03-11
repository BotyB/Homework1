package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone {
    private final String imei;
    private final int batteryLife;
    private int remainingBatteryLife;
    private final String color;
    private final String material;
    private final List<Contact> contacts;
    private final List<Message> messages;
    private final List<Call> callHistory;
    //IntelliJ wants to make this fields final

    public Phone(String imei, int batteryLife, String color, String material) {
        this.imei = imei;
        this.batteryLife = batteryLife;
        this.remainingBatteryLife = batteryLife;
        this.color = color;
        this.material = material;
        this.contacts = new ArrayList<>();
        this.messages = new ArrayList<>();
        this.callHistory = new ArrayList<>();
    }

    public void addContact(String id, String phoneNumber, String firstName, String lastName) {
        contacts.add(new Contact(id, phoneNumber, firstName, lastName));
    }

    public Contact getFirstContact() {
        return contacts.get(0);
    }

    public Contact getLastContact() {
        return contacts.get(contacts.size() - 1);
    }

    public void sendMessage(String phoneNumber, String content) {
        if (content.length() > 500) { //This is the initial request of 500 characters, there is one in the Homework about 100.
            System.out.println("Message exceeds 500 characters");
            return;
        }
        if (batteryLife < 1) {
            System.out.println("Not enough battery life to send message");
            return;
        }
        messages.add(new Message(phoneNumber, content));
        System.out.println("Message sent to: " + phoneNumber + "\n>> " + content + " <<");
        deductBatteryLife(1);
    }

    public String getFirstMessage(String phoneNumber) {
        for (Message message : messages) {
            if (message.getPhoneNumber().equals(phoneNumber)) {
                return message.getContent();
            }
        }
        return "No message found from this contact";
    }

    public String getSecondMessage(String phoneNumber) {
        int count = 0;
        for (Message message : messages) {
            if (message.getPhoneNumber().equals(phoneNumber)) {
                count++;
                if (count == 2) {
                    return message.getContent();
                }
            }
        }
        return "No second message found from this contact";
    }

    public void call(String phoneNumber) {
        if (remainingBatteryLife < 2) {
            System.out.println("Not enough battery life to make a call");
            return;
        }
        callHistory.add(new Call(phoneNumber));
        System.out.println("Calling " + phoneNumber);
        deductBatteryLife(2);
    }

    public void viewHistory() {
        System.out.println("Call history:");
        for (Call call : callHistory) {
            System.out.println("Called: " + call.getPhoneNumber());
        }
    }

    private void deductBatteryLife(int hours) {
        remainingBatteryLife -= hours;
        System.out.println("Battery life reduced by " + hours + " hour(s). Remaining battery life: " + remainingBatteryLife + " hour(s)");

    }

    public void printRemainingBatteryLife() {
        System.out.println("Remaining battery life: " + remainingBatteryLife + " hour(s)");
    }

    public String getImei() {
        return imei;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }
}
