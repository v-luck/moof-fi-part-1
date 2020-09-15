public class Bird {
    private String name;
    private String latinName;
    private int amountOfObservations;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.amountOfObservations = 0;
    }

    public void increaseObservationCount() {
        amountOfObservations ++;
    }

    public String returnBirdName() {
        return name;
    }

    public String toString() {
        return String.format("%s (%s): %d observations", name, latinName, this.amountOfObservations);
    }

}
