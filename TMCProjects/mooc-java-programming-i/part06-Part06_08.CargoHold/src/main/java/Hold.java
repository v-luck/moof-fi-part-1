import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> holdItems;
    private int totalWeight = 0;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.holdItems = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight + suitcase.totalWeight() <= this.maximumWeight) {
            this.totalWeight += suitcase.totalWeight();
            this.holdItems.add(suitcase);
        }
    }

    public String toString() {
        return this.holdItems.size() + " suitcases (" + this.totalWeight + " kg)";
    }

    public void printItems() {
        for (Suitcase suitcase : this.holdItems) {
            suitcase.printItems();
        }
    }
}


