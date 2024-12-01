package FinalJava;

public class Card {
    // Fields
    private int value;
    private String name;

    // Constructor
    public Card(int value, String name) {
        this.value = value;
        this.name = name;
    }

    // Getters and Setters
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method to describe the card
    public void describe() {
        System.out.println(name + " with value " + value);
    }
}

