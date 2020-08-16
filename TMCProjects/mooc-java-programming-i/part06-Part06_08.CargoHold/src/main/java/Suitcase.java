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
        if (this.totalWeight + item.getWeight() <= this.maximumWeight) {
            this.suitcaseItems.add(item);
            this.totalWeight += item.getWeight();
        }
    }

    public String toString() {
        if (this.suitcaseItems.size() == 1) {
            return String.valueOf(this.suitcaseItems.size()) + " item (" + this.totalWeight + " kg)";
        } else if (this.suitcaseItems.isEmpty()) {
            return "no items (0 kg)";
        }
        return String.valueOf(this.suitcaseItems.size()) + " items (" + this.totalWeight + " kg)";
    }

    public void printItems() {
        for (Item i : this.suitcaseItems) {
            System.out.println(i);
        }
    }

    public int totalWeight() {
        return this.totalWeight;
    }

    public Item heaviestItem() {
        if (this.suitcaseItems.isEmpty()) {
            return null;
        }


        Item heavyiestItem = this.suitcaseItems.get(0);
        for (Item item : this.suitcaseItems) {
            if (item.getWeight() > heavyiestItem.getWeight()) {
                heavyiestItem = item;
            }
        }

        return heavyiestItem;
    }
}
