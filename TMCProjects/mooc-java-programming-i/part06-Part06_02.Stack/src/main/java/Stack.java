import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    public boolean isEmpty() {
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }

    public void add(String value) {
        stack.add(value);
    }

    public ArrayList<String> values() {
        return stack;
    }

    public String take() {
        int index = this.stack.size() - 1;
        String removedValue = stack.get(index);
        stack.remove(index);
        return String.valueOf(removedValue);
    }
}
