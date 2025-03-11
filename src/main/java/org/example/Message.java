package org.example;

public class Message {
    private final String phoneNumber;
    private final String content;

    public Message(String phoneNumber, String content) {
        this.phoneNumber = phoneNumber;
        this.content = content;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getContent() {
        return content;
    }
}

//Can be converted to Record Class >> "public record Message(String phoneNumber, String content) { <<
//}
