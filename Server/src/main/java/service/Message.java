package service;

import java.io.Serializable;

public class Message implements Serializable {
    private static final long serialVersionUID = 1L;

    private String text;
    private int number;

    public Message(String text, int number) {
        this.text = text;
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Message{text='" + text + "', number=" + number + "}";
    }
}
