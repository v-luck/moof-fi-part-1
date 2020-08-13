
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        String stringSize = String.valueOf(this.elements.size());
        String collectionList = "";
        for (String alphabets : this.elements) {
            collectionList += ("\n" + alphabets);
        }

        if (this.elements.size() == 1) {
            return "The collection " + this.name + " has " + stringSize + " element:" + collectionList;
        } else {
            return "The collection " + this.name + " has " + stringSize + " elements:" + collectionList;
        }

    }
    
}
