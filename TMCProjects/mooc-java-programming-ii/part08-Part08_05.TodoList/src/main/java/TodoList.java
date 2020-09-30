import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> arrayList;

    public TodoList() {
        this.arrayList = new ArrayList<>();
    }

    public void add(String task) {
        arrayList.add(task);
    }

    public void print() {
        for (int i = 0; i < arrayList.size(); i ++) {
            System.out.print((i+1) + ": ");
            System.out.println(arrayList.get(i));
        }
    }

    public void remove(int number) {
        try {
            arrayList.remove(number - 1);
        } catch (Exception e) {
        }
    }


}
