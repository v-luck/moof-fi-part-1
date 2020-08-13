import java.util.ArrayList;

public class Suitcase {
    private int maximumWeight;
    private ArrayList<Item> suitcaseItems;
    private int totalWeight = 0;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcaseItems = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (totalWeight + item.getWeight() <= this.maximumWeight) {
            this.suitcaseItems.add(item);
            this.totalWeight += item.getWeight();
        }
    }

    public String toString() {
        return String.valueOf(this.suitcaseItems.size()) + " items (" + this.totalWeight + ")";
    }
}
