public class Container {
    private int liquidStored;

    public Container() {
        this.liquidStored = 0;
    }

    public int contains() {
        return liquidStored;
    }

    public void add(int amount) {
        if (amount < 0) {
        } else if (liquidStored + amount > 100) {
            liquidStored = 100;
        } else {
            this.liquidStored += amount;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
        } else if (liquidStored - amount < 0) {
            liquidStored = 0;
        } else {
            this.liquidStored -= amount;
        }
    }

    public String toString() {
        return contains() + "/100";
    }
}
