public class Container {

    private int amountOfLiquid;

    public Container() {
        amountOfLiquid = 0;
    }

    public int contains() {
        return this.amountOfLiquid;
    }

    public void add(int amount) {
        if (amount >= 0) {
            if (amountOfLiquid + amount <= 100) {
                amountOfLiquid += amount;
            } else {
                amountOfLiquid = 100;
            }
        }
    }

    public void remove(int amount) {
        if (amount >= 0) {
            if (amountOfLiquid - amount >= 0) {
                amountOfLiquid -= amount;
            } else {
                amountOfLiquid = 0;
            }
        }
    }

    public String toString() {
       return String.format("%d/100", amountOfLiquid);
    }

}
