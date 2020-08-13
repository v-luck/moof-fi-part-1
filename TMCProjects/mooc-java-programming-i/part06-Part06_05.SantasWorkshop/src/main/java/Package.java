import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> giftList;

    public Package() {
        this.giftList = new ArrayList<>();
    }
    public void addGift(Gift gift) {
        this.giftList.add(gift);
    }
    public int totalWeight() {
        int weigt = 0;
        for (Gift gift : this.giftList) {
            weigt += gift.getWeight();
        }

        return weigt;
    }
}
