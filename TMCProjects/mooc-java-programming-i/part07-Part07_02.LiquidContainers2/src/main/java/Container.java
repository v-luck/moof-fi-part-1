public class Container {
    private int maximumAmount;
    private int amount;

    public Container() {
        this.maximumAmount = 100;
        this.amount = 0;
    }
    public int contains() {
        return amount;
    }

    public void add(int amount) {
        if (amount >= 0) {
            if (this.amount + amount > this.maximumAmount) {
                this.amount = 100;
            } else {
                this.amount += amount;
            }
        }
    }

    public void remove(int amount) {
        if (amount >= 0) {
            if (this.amount - amount < 0) {
                this.amount = 0;
            } else {
                this.amount -= amount;
            }
        }
    }

    public String toString() {
        return this.amount + "/100";
    }
}
