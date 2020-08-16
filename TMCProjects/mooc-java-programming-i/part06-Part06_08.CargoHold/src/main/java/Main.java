
public class Main {

    public static void main(String[] args) {
        Item item = new Item("dragon", 8);
        Suitcase suitcase = new Suitcase(10);
        Hold hold = new Hold(100);
        hold.addSuitcase(suitcase);

    }

}
