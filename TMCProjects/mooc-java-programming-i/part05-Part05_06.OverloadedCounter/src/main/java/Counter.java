public class Counter {
    private int startValue;

    public Counter() {
        this(0);
    }
    public Counter(int startValue) {
        this.startValue = startValue;
    }

    public int value() {
        return this.startValue;
    }

    public void increase() {
        this.startValue += 1;
    }

    public void increase(int increaseBy) {
        if (increaseBy >= 0) {
            this.startValue += increaseBy;
        }
    }

    public void decrease() {
        this.startValue -= 1;
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy >= 0) {
            this.startValue -= decreaseBy;
        }
    }
}